/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets.arabiannights;

import java.util.UUID;
import mage.abilities.common.AsEntersBattlefieldAbility;
import mage.abilities.effects.common.ChooseOpponentEffect;
import mage.abilities.effects.common.ChooseColorEffect;
import mage.cards.CardImpl;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.Rarity;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.FilterPermanent;
import mage.filter.predicate.mageobject.ColorPredicate;
import mage.ObjectColor;
import mage.abilities.Ability;
import mage.abilities.decorator.ConditionalOneShotEffect;
import mage.abilities.TriggeredAbility;
import mage.abilities.common.OnEventTriggeredAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.condition.Condition;
import mage.abilities.condition.common.NoCreatureCondition;
import mage.abilities.decorator.ConditionalTriggeredAbility;
import mage.abilities.effects.common.SacrificeSourceEffect;
import mage.abilities.effects.common.continuous.BoostAllEffect;
import mage.constants.Duration;
import mage.constants.Rarity;
import mage.constants.Zone;
import mage.filter.predicate.Predicates;
import mage.filter.predicate.permanent.TokenPredicate;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.players.Player;

/**
 *
 * @author MarcoMarin
 */
public class Jihad extends CardImpl {

    private static final FilterCreaturePermanent filter = new FilterCreaturePermanent("White creatures");

    static {
        filter.add(new ColorPredicate(ObjectColor.WHITE));
    }

    public Jihad(UUID ownerId) {
        super(ownerId, 60, "Jihad", Rarity.RARE, new CardType[]{CardType.ENCHANTMENT}, "{W}{W}{W}");
        this.expansionSetCode = "ARN";

        // As Jihad enters the battlefield, choose a color and an opponent.
        this.addAbility(new AsEntersBattlefieldAbility(new ChooseColorEffect(Outcome.Detriment)));
        this.addAbility(new AsEntersBattlefieldAbility(new ChooseOpponentEffect(Outcome.Detriment)));
        
        // White creatures get +2/+1 as long as the chosen player controls a nontoken permanent of the chosen color.
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new BoostAllEffect(2, 1, Duration.WhileOnBattlefield, filter, false)));
        
        // When the chosen player controls no nontoken permanents of the chosen color, sacrifice Jihad.
        
        // Not quite as immediate as I'd like but.. Static doesnt accept that effect and probably only work upon casting (maybe a continuous ability would, if not hog the system)
        TriggeredAbility triggered = new OnEventTriggeredAbility(GameEvent.EventType.STEP_CHANGED, "end Jihad", true, new SacrificeSourceEffect());
        this.addAbility(new ConditionalTriggeredAbility(triggered, new NoColoredPermanentOpponentCondition(), "no nontoken permanents of the chosen color, sacrifice Jihad"));
        //this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new ConditionalOneShotEffect(new SacrificeSourceEffect()), new NoColoredPermanentOpponentCondition(), "Jihad ending"));
        
    }

    public Jihad(final Jihad card) {
        super(card);
    }

    @Override
    public Jihad copy() {
        return new Jihad(this);
    }
}

class NoColoredPermanentOpponentCondition implements Condition {

    private static NoColoredPermanentOpponentCondition fInstance = new NoColoredPermanentOpponentCondition();
           
    public static Condition getInstance() {
        return fInstance;
    }

    @Override
    public boolean apply(Game game, Ability source) {
        UUID chosenOpponent = (UUID) game.getState().getValue(source.getSourceId().toString() + ChooseOpponentEffect.VALUE_KEY);
        
        FilterPermanent filter = new FilterPermanent();
        filter.add(new ColorPredicate((ObjectColor) game.getState().getValue(source.getSourceId() + "_color")));
        filter.add(Predicates.not(new TokenPredicate()));        
        //filter.add(new ColorPredicate(ObjectColor.WHITE)); // Given this typing, somehow the above doesn't seem right, but I copied from StoryCircle card
            
        return game.getBattlefield().countAll(filter, chosenOpponent, game)==0;
        
    }
}
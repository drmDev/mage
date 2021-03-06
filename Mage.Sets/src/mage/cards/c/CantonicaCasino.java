package mage.cards.c;

import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.effects.OneShotEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.game.Game;
import mage.players.Player;

import java.util.UUID;

/**
 * @author NinthWorld
 */
public final class CantonicaCasino extends CardImpl {

    public CantonicaCasino(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT}, "{2}");

        // {T}: Roll two six-sided dice. If you roll doubles, gain 10 life. Otherwise, lose 1 life.
        this.addAbility(new SimpleActivatedAbility(new CantonicaCasinoEffect(), new TapSourceCost()));
    }

    private CantonicaCasino(final CantonicaCasino card) {
        super(card);
    }

    @Override
    public CantonicaCasino copy() {
        return new CantonicaCasino(this);
    }
}

class CantonicaCasinoEffect extends OneShotEffect {

    CantonicaCasinoEffect() {
        super(Outcome.Neutral);
        staticText = "Roll two six-sided dice. If you roll doubles, gain 10 life. Otherwise, you lose 1 life";
    }

    private CantonicaCasinoEffect(final CantonicaCasinoEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player you = game.getPlayer(source.getControllerId());
        if (you != null) {
            // Roll two six-sided dice
            int dice1 = you.rollDice(game, 6);
            int dice2 = you.rollDice(game, 6);

            if (dice1 == dice2) {
                // If you roll doubles, gain 10 life
                you.gainLife(10, game, source);
            } else {
                // Otherwise, lose 1 life
                you.loseLife(1, game, false);
            }
            return true;
        }
        return false;
    }

    @Override
    public CantonicaCasinoEffect copy() {
        return new CantonicaCasinoEffect(this);
    }
}

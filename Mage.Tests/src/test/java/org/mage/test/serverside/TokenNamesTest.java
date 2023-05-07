package org.mage.test.serverside;

import mage.constants.PhaseStep;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.game.permanent.token.custom.CreatureToken;
import org.junit.Assert;
import org.junit.Test;
import org.mage.test.serverside.base.CardTestPlayerBase;

/**
 * 111.4. A spell or ability that creates a token sets both its name and its subtype(s).
 * If the spell or ability doesn’t specify the name of the token, its name is the same as
 * its subtype(s) plus the word “Token.” Once a token is on the battlefield, changing its
 * name doesn’t change its subtype(s), and vice versa.
 * <p>
 * 111.10. Some effects instruct a player to create a predefined token. These effects use the
 * definition below to determine the characteristics the token is created with. The effect that
 * creates a predefined token may also modify or add to the predefined characteristics.
 *
 * @author JayDi85
 */
public class TokenNamesTest extends CardTestPlayerBase {

    @Test
    public void test_Rules_111_4_Example1() {
        // Example: Dwarven Reinforcements is a sorcery that says, in part, “Create two 2/1 red Dwarf Berserker
        // creature tokens.” The tokens created as it resolves are each named Dwarf Berserker Token and each
        // have the creature types Dwarf and Berserker.

        addCard(Zone.HAND, playerA, "Dwarven Reinforcements", 1); // {3}{R}
        addCard(Zone.BATTLEFIELD, playerA, "Mountain", 4);

        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Dwarven Reinforcements");

        setStrictChooseMode(true);
        setStopAt(1, PhaseStep.END_TURN);
        execute();

        assertPermanentCount(playerA, "Dwarf Berserker Token", 2);
    }

    @Test
    public void test_Rules_111_4_Example2() {
        // Example: Minsc, Beloved Ranger says, in part, “When Minsc, Beloved Ranger enters the battlefield,
        // create Boo, a legendary 1/1 red Hamster creature token with trample and haste.” That token’s
        // subtype is Hamster, but because Minsc specifies that the token’s name is Boo, neither “Hamster”
        // nor “Token” are part of its name.

        addCard(Zone.HAND, playerA, "Minsc, Beloved Ranger", 1); // {R}{G}{W}
        addCard(Zone.BATTLEFIELD, playerA, "Mountain", 1);
        addCard(Zone.BATTLEFIELD, playerA, "Forest", 1);
        addCard(Zone.BATTLEFIELD, playerA, "Plains", 1);

        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Minsc, Beloved Ranger");

        setStrictChooseMode(true);
        setStopAt(1, PhaseStep.END_TURN);
        execute();

        assertPermanentCount(playerA, "Boo", 1);
    }

    @Test
    public void test_Rules_111_4_Example3() {
        // Example: Spitting Image is a sorcery that says, in part, “Create a token that’s a copy of target
        // creature.” All of that token’s characteristics will match the copiable characteristics of the
        // creature targeted by that spell. If Spitting Image targets Doomed Dissenter, a Human creature,
        // the name of the token the spell creates will be Doomed Dissenter, not Human Token or Doomed Dissenter Token.

        // Create a token that's a copy of target creature.
        addCard(Zone.HAND, playerA, "Spitting Image", 1); // {4}{G/U}{G/U}
        addCard(Zone.BATTLEFIELD, playerA, "Mountain", 4);
        addCard(Zone.BATTLEFIELD, playerA, "Forest", 2);
        //
        addCard(Zone.BATTLEFIELD, playerA, "Doomed Dissenter", 1);

        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Spitting Image");
        addTarget(playerA, "Doomed Dissenter");

        setStrictChooseMode(true);
        setStopAt(1, PhaseStep.END_TURN);
        execute();

        assertPermanentCount(playerA, "Doomed Dissenter", 2); // card + token
        assertTokenCount(playerA, "Doomed Dissenter", 1);
    }

    @Test
    public void test_Rules_111_4_AutoGeneratedName() {
        Assert.assertEquals("Human Cleric Token", new CreatureToken(2, 2, "", SubType.HUMAN, SubType.CLERIC).getName());
        Assert.assertEquals("Warrior Token", new CreatureToken(2, 2, "", SubType.WARRIOR).getName());
        Assert.assertEquals("Custom Name", new CreatureToken(2, 2, "", SubType.WARRIOR).withName("Custom Name").getName());
    }
}
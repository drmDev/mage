package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;
import mage.collation.BoosterCollator;
import mage.collation.BoosterStructure;
import mage.collation.CardRun;
import mage.collation.RarityConfiguration;

import java.util.ArrayList;
import java.util.List;

public final class Tempest extends ExpansionSet {

    private static final Tempest instance = new Tempest();

    public static Tempest getInstance() {
        return instance;
    }

    private Tempest() {
        super("Tempest", "TMP", ExpansionSet.buildDate(1997, 10, 1), SetType.EXPANSION);
        this.blockName = "Tempest";
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Abandon Hope", 107, Rarity.UNCOMMON, mage.cards.a.AbandonHope.class));
        cards.add(new SetCardInfo("Advance Scout", 1, Rarity.COMMON, mage.cards.a.AdvanceScout.class));
        cards.add(new SetCardInfo("Aftershock", 160, Rarity.COMMON, mage.cards.a.Aftershock.class));
        cards.add(new SetCardInfo("Altar of Dementia", 276, Rarity.RARE, mage.cards.a.AltarOfDementia.class));
        cards.add(new SetCardInfo("Aluren", 213, Rarity.RARE, mage.cards.a.Aluren.class));
        cards.add(new SetCardInfo("Ancient Runes", 161, Rarity.UNCOMMON, mage.cards.a.AncientRunes.class));
        cards.add(new SetCardInfo("Ancient Tomb", 315, Rarity.UNCOMMON, mage.cards.a.AncientTomb.class));
        cards.add(new SetCardInfo("Angelic Protector", 2, Rarity.UNCOMMON, mage.cards.a.AngelicProtector.class));
        cards.add(new SetCardInfo("Anoint", 3, Rarity.COMMON, mage.cards.a.Anoint.class));
        cards.add(new SetCardInfo("Apes of Rath", 214, Rarity.UNCOMMON, mage.cards.a.ApesOfRath.class));
        cards.add(new SetCardInfo("Apocalypse", 162, Rarity.RARE, mage.cards.a.Apocalypse.class));
        cards.add(new SetCardInfo("Armor Sliver", 4, Rarity.UNCOMMON, mage.cards.a.ArmorSliver.class));
        cards.add(new SetCardInfo("Armored Pegasus", 5, Rarity.COMMON, mage.cards.a.ArmoredPegasus.class));
        cards.add(new SetCardInfo("Auratog", 6, Rarity.RARE, mage.cards.a.Auratog.class));
        cards.add(new SetCardInfo("Avenging Angel", 7, Rarity.RARE, mage.cards.a.AvengingAngel.class));
        cards.add(new SetCardInfo("Barbed Sliver", 163, Rarity.UNCOMMON, mage.cards.b.BarbedSliver.class));
        cards.add(new SetCardInfo("Bayou Dragonfly", 215, Rarity.COMMON, mage.cards.b.BayouDragonfly.class));
        cards.add(new SetCardInfo("Bellowing Fiend", 108, Rarity.RARE, mage.cards.b.BellowingFiend.class));
        cards.add(new SetCardInfo("Benthic Behemoth", 54, Rarity.RARE, mage.cards.b.BenthicBehemoth.class));
        cards.add(new SetCardInfo("Blood Frenzy", 164, Rarity.COMMON, mage.cards.b.BloodFrenzy.class));
        cards.add(new SetCardInfo("Blood Pet", 109, Rarity.COMMON, mage.cards.b.BloodPet.class));
        cards.add(new SetCardInfo("Boil", 165, Rarity.UNCOMMON, mage.cards.b.Boil.class));
        cards.add(new SetCardInfo("Booby Trap", 277, Rarity.RARE, mage.cards.b.BoobyTrap.class));
        cards.add(new SetCardInfo("Bottle Gnomes", 278, Rarity.UNCOMMON, mage.cards.b.BottleGnomes.class));
        cards.add(new SetCardInfo("Bounty Hunter", 110, Rarity.RARE, mage.cards.b.BountyHunter.class));
        cards.add(new SetCardInfo("Broken Fall", 216, Rarity.COMMON, mage.cards.b.BrokenFall.class));
        cards.add(new SetCardInfo("Caldera Lake", 316, Rarity.RARE, mage.cards.c.CalderaLake.class));
        cards.add(new SetCardInfo("Canopy Spider", 217, Rarity.COMMON, mage.cards.c.CanopySpider.class));
        cards.add(new SetCardInfo("Canyon Drake", 166, Rarity.RARE, mage.cards.c.CanyonDrake.class));
        cards.add(new SetCardInfo("Canyon Wildcat", 167, Rarity.COMMON, mage.cards.c.CanyonWildcat.class));
        cards.add(new SetCardInfo("Capsize", 55, Rarity.COMMON, mage.cards.c.Capsize.class));
        cards.add(new SetCardInfo("Carrionette", 111, Rarity.RARE, mage.cards.c.Carrionette.class));
        cards.add(new SetCardInfo("Chaotic Goo", 168, Rarity.RARE, mage.cards.c.ChaoticGoo.class));
        cards.add(new SetCardInfo("Charging Rhino", 218, Rarity.UNCOMMON, mage.cards.c.ChargingRhino.class));
        cards.add(new SetCardInfo("Chill", 56, Rarity.UNCOMMON, mage.cards.c.Chill.class));
        cards.add(new SetCardInfo("Choke", 219, Rarity.UNCOMMON, mage.cards.c.Choke.class));
        cards.add(new SetCardInfo("Cinder Marsh", 317, Rarity.UNCOMMON, mage.cards.c.CinderMarsh.class));
        cards.add(new SetCardInfo("Circle of Protection: Black", 8, Rarity.COMMON, mage.cards.c.CircleOfProtectionBlack.class));
        cards.add(new SetCardInfo("Circle of Protection: Blue", 9, Rarity.COMMON, mage.cards.c.CircleOfProtectionBlue.class));
        cards.add(new SetCardInfo("Circle of Protection: Green", 10, Rarity.COMMON, mage.cards.c.CircleOfProtectionGreen.class));
        cards.add(new SetCardInfo("Circle of Protection: Red", 11, Rarity.COMMON, mage.cards.c.CircleOfProtectionRed.class));
        cards.add(new SetCardInfo("Circle of Protection: Shadow", 12, Rarity.COMMON, mage.cards.c.CircleOfProtectionShadow.class));
        cards.add(new SetCardInfo("Circle of Protection: White", 13, Rarity.COMMON, mage.cards.c.CircleOfProtectionWhite.class));
        cards.add(new SetCardInfo("Clergy en-Vec", 14, Rarity.COMMON, mage.cards.c.ClergyEnVec.class));
        cards.add(new SetCardInfo("Clot Sliver", 112, Rarity.COMMON, mage.cards.c.ClotSliver.class));
        cards.add(new SetCardInfo("Cloudchaser Eagle", 15, Rarity.COMMON, mage.cards.c.CloudchaserEagle.class));
        cards.add(new SetCardInfo("Coercion", 113, Rarity.COMMON, mage.cards.c.Coercion.class));
        cards.add(new SetCardInfo("Coffin Queen", 114, Rarity.RARE, mage.cards.c.CoffinQueen.class));
        cards.add(new SetCardInfo("Coiled Tinviper", 279, Rarity.COMMON, mage.cards.c.CoiledTinviper.class));
        cards.add(new SetCardInfo("Cold Storage", 280, Rarity.RARE, mage.cards.c.ColdStorage.class));
        cards.add(new SetCardInfo("Commander Greven il-Vec", 115, Rarity.RARE, mage.cards.c.CommanderGrevenIlVec.class));
        cards.add(new SetCardInfo("Corpse Dance", 116, Rarity.RARE, mage.cards.c.CorpseDance.class));
        cards.add(new SetCardInfo("Counterspell", 57, Rarity.COMMON, mage.cards.c.Counterspell.class));
        cards.add(new SetCardInfo("Crazed Armodon", 220, Rarity.RARE, mage.cards.c.CrazedArmodon.class));
        cards.add(new SetCardInfo("Crown of Flames", 169, Rarity.COMMON, mage.cards.c.CrownOfFlames.class));
        cards.add(new SetCardInfo("Cursed Scroll", 281, Rarity.RARE, mage.cards.c.CursedScroll.class));
        cards.add(new SetCardInfo("Dark Banishing", 117, Rarity.COMMON, mage.cards.d.DarkBanishing.class));
        cards.add(new SetCardInfo("Dark Ritual", 118, Rarity.COMMON, mage.cards.d.DarkRitual.class));
        cards.add(new SetCardInfo("Darkling Stalker", 119, Rarity.COMMON, mage.cards.d.DarklingStalker.class));
        cards.add(new SetCardInfo("Dauthi Embrace", 120, Rarity.UNCOMMON, mage.cards.d.DauthiEmbrace.class));
        cards.add(new SetCardInfo("Dauthi Ghoul", 121, Rarity.UNCOMMON, mage.cards.d.DauthiGhoul.class));
        cards.add(new SetCardInfo("Dauthi Horror", 122, Rarity.COMMON, mage.cards.d.DauthiHorror.class));
        cards.add(new SetCardInfo("Dauthi Marauder", 123, Rarity.COMMON, mage.cards.d.DauthiMarauder.class));
        cards.add(new SetCardInfo("Dauthi Mercenary", 124, Rarity.UNCOMMON, mage.cards.d.DauthiMercenary.class));
        cards.add(new SetCardInfo("Dauthi Mindripper", 125, Rarity.UNCOMMON, mage.cards.d.DauthiMindripper.class));
        cards.add(new SetCardInfo("Dauthi Slayer", 126, Rarity.COMMON, mage.cards.d.DauthiSlayer.class));
        cards.add(new SetCardInfo("Deadshot", 170, Rarity.RARE, mage.cards.d.Deadshot.class));
        cards.add(new SetCardInfo("Death Pits of Rath", 127, Rarity.RARE, mage.cards.d.DeathPitsOfRath.class));
        cards.add(new SetCardInfo("Diabolic Edict", 128, Rarity.COMMON, mage.cards.d.DiabolicEdict.class));
        cards.add(new SetCardInfo("Dirtcowl Wurm", 221, Rarity.RARE, mage.cards.d.DirtcowlWurm.class));
        cards.add(new SetCardInfo("Disenchant", 16, Rarity.COMMON, mage.cards.d.Disenchant.class));
        cards.add(new SetCardInfo("Dismiss", 58, Rarity.UNCOMMON, mage.cards.d.Dismiss.class));
        cards.add(new SetCardInfo("Disturbed Burial", 129, Rarity.COMMON, mage.cards.d.DisturbedBurial.class));
        cards.add(new SetCardInfo("Dracoplasm", 266, Rarity.RARE, mage.cards.d.Dracoplasm.class));
        cards.add(new SetCardInfo("Dread of Night", 130, Rarity.UNCOMMON, mage.cards.d.DreadOfNight.class));
        cards.add(new SetCardInfo("Dream Cache", 59, Rarity.COMMON, mage.cards.d.DreamCache.class));
        cards.add(new SetCardInfo("Dregs of Sorrow", 131, Rarity.RARE, mage.cards.d.DregsOfSorrow.class));
        cards.add(new SetCardInfo("Duplicity", 60, Rarity.RARE, mage.cards.d.Duplicity.class));
        cards.add(new SetCardInfo("Earthcraft", 222, Rarity.RARE, mage.cards.e.Earthcraft.class));
        cards.add(new SetCardInfo("Echo Chamber", 282, Rarity.RARE, mage.cards.e.EchoChamber.class));
        cards.add(new SetCardInfo("Eladamri's Vineyard", 223, Rarity.RARE, mage.cards.e.EladamrisVineyard.class));
        cards.add(new SetCardInfo("Eladamri, Lord of Leaves", 224, Rarity.RARE, mage.cards.e.EladamriLordOfLeaves.class));
        cards.add(new SetCardInfo("Elite Javelineer", 17, Rarity.COMMON, mage.cards.e.EliteJavelineer.class));
        cards.add(new SetCardInfo("Elven Warhounds", 225, Rarity.RARE, mage.cards.e.ElvenWarhounds.class));
        cards.add(new SetCardInfo("Elvish Fury", 226, Rarity.COMMON, mage.cards.e.ElvishFury.class));
        cards.add(new SetCardInfo("Emerald Medallion", 283, Rarity.RARE, mage.cards.e.EmeraldMedallion.class));
        cards.add(new SetCardInfo("Emmessi Tome", 284, Rarity.RARE, mage.cards.e.EmmessiTome.class));
        cards.add(new SetCardInfo("Endless Scream", 132, Rarity.COMMON, mage.cards.e.EndlessScream.class));
        cards.add(new SetCardInfo("Energizer", 285, Rarity.RARE, mage.cards.e.Energizer.class));
        cards.add(new SetCardInfo("Enfeeblement", 133, Rarity.COMMON, mage.cards.e.Enfeeblement.class));
        cards.add(new SetCardInfo("Enraging Licid", 171, Rarity.UNCOMMON, mage.cards.e.EnragingLicid.class));
        cards.add(new SetCardInfo("Escaped Shapeshifter", 62, Rarity.RARE, mage.cards.e.EscapedShapeshifter.class));
        cards.add(new SetCardInfo("Essence Bottle", 286, Rarity.UNCOMMON, mage.cards.e.EssenceBottle.class));
        cards.add(new SetCardInfo("Evincar's Justice", 134, Rarity.COMMON, mage.cards.e.EvincarsJustice.class));
        cards.add(new SetCardInfo("Excavator", 287, Rarity.UNCOMMON, mage.cards.e.Excavator.class));
        cards.add(new SetCardInfo("Extinction", 135, Rarity.RARE, mage.cards.e.Extinction.class));
        cards.add(new SetCardInfo("Fevered Convulsions", 136, Rarity.RARE, mage.cards.f.FeveredConvulsions.class));
        cards.add(new SetCardInfo("Field of Souls", 18, Rarity.RARE, mage.cards.f.FieldOfSouls.class));
        cards.add(new SetCardInfo("Fighting Drake", 63, Rarity.UNCOMMON, mage.cards.f.FightingDrake.class));
        cards.add(new SetCardInfo("Firefly", 172, Rarity.UNCOMMON, mage.cards.f.Firefly.class));
        cards.add(new SetCardInfo("Fireslinger", 173, Rarity.COMMON, mage.cards.f.Fireslinger.class));
        cards.add(new SetCardInfo("Flailing Drake", 227, Rarity.UNCOMMON, mage.cards.f.FlailingDrake.class));
        cards.add(new SetCardInfo("Flickering Ward", 19, Rarity.UNCOMMON, mage.cards.f.FlickeringWard.class));
        cards.add(new SetCardInfo("Flowstone Giant", 174, Rarity.COMMON, mage.cards.f.FlowstoneGiant.class));
        cards.add(new SetCardInfo("Flowstone Salamander", 175, Rarity.UNCOMMON, mage.cards.f.FlowstoneSalamander.class));
        cards.add(new SetCardInfo("Flowstone Sculpture", 288, Rarity.RARE, mage.cards.f.FlowstoneSculpture.class));
        cards.add(new SetCardInfo("Flowstone Wyvern", 176, Rarity.RARE, mage.cards.f.FlowstoneWyvern.class));
        cards.add(new SetCardInfo("Fool's Tome", 289, Rarity.RARE, mage.cards.f.FoolsTome.class));
        cards.add(new SetCardInfo("Forest", 347, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 348, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 349, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 350, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Frog Tongue", 228, Rarity.COMMON, mage.cards.f.FrogTongue.class));
        cards.add(new SetCardInfo("Fugitive Druid", 229, Rarity.RARE, mage.cards.f.FugitiveDruid.class));
        cards.add(new SetCardInfo("Furnace of Rath", 177, Rarity.RARE, mage.cards.f.FurnaceOfRath.class));
        cards.add(new SetCardInfo("Fylamarid", 64, Rarity.UNCOMMON, mage.cards.f.Fylamarid.class));
        cards.add(new SetCardInfo("Gallantry", 20, Rarity.UNCOMMON, mage.cards.g.Gallantry.class));
        cards.add(new SetCardInfo("Gaseous Form", 65, Rarity.COMMON, mage.cards.g.GaseousForm.class));
        cards.add(new SetCardInfo("Gerrard's Battle Cry", 21, Rarity.RARE, mage.cards.g.GerrardsBattleCry.class));
        cards.add(new SetCardInfo("Ghost Town", 318, Rarity.UNCOMMON, mage.cards.g.GhostTown.class));
        cards.add(new SetCardInfo("Giant Crab", 66, Rarity.COMMON, mage.cards.g.GiantCrab.class));
        cards.add(new SetCardInfo("Giant Strength", 178, Rarity.COMMON, mage.cards.g.GiantStrength.class));
        cards.add(new SetCardInfo("Goblin Bombardment", 179, Rarity.UNCOMMON, mage.cards.g.GoblinBombardment.class));
        cards.add(new SetCardInfo("Gravedigger", 137, Rarity.COMMON, mage.cards.g.Gravedigger.class));
        cards.add(new SetCardInfo("Grindstone", 290, Rarity.RARE, mage.cards.g.Grindstone.class));
        cards.add(new SetCardInfo("Hand to Hand", 180, Rarity.RARE, mage.cards.h.HandToHand.class));
        cards.add(new SetCardInfo("Hanna's Custody", 22, Rarity.RARE, mage.cards.h.HannasCustody.class));
        cards.add(new SetCardInfo("Harrow", 230, Rarity.UNCOMMON, mage.cards.h.Harrow.class));
        cards.add(new SetCardInfo("Havoc", 181, Rarity.UNCOMMON, mage.cards.h.Havoc.class));
        cards.add(new SetCardInfo("Heart Sliver", 182, Rarity.COMMON, mage.cards.h.HeartSliver.class));
        cards.add(new SetCardInfo("Heartwood Dryad", 231, Rarity.COMMON, mage.cards.h.HeartwoodDryad.class));
        cards.add(new SetCardInfo("Heartwood Giant", 232, Rarity.RARE, mage.cards.h.HeartwoodGiant.class));
        cards.add(new SetCardInfo("Heartwood Treefolk", 233, Rarity.UNCOMMON, mage.cards.h.HeartwoodTreefolk.class));
        cards.add(new SetCardInfo("Helm of Possession", 291, Rarity.RARE, mage.cards.h.HelmOfPossession.class));
        cards.add(new SetCardInfo("Hero's Resolve", 23, Rarity.COMMON, mage.cards.h.HerosResolve.class));
        cards.add(new SetCardInfo("Horned Sliver", 234, Rarity.UNCOMMON, mage.cards.h.HornedSliver.class));
        cards.add(new SetCardInfo("Horned Turtle", 67, Rarity.COMMON, mage.cards.h.HornedTurtle.class));
        cards.add(new SetCardInfo("Humility", 24, Rarity.RARE, mage.cards.h.Humility.class));
        cards.add(new SetCardInfo("Imps' Taunt", 138, Rarity.UNCOMMON, mage.cards.i.ImpsTaunt.class));
        cards.add(new SetCardInfo("Insight", 68, Rarity.UNCOMMON, mage.cards.i.Insight.class));
        cards.add(new SetCardInfo("Interdict", 69, Rarity.UNCOMMON, mage.cards.i.Interdict.class));
        cards.add(new SetCardInfo("Intuition", 70, Rarity.RARE, mage.cards.i.Intuition.class));
        cards.add(new SetCardInfo("Invulnerability", 25, Rarity.UNCOMMON, mage.cards.i.Invulnerability.class));
        cards.add(new SetCardInfo("Island", 335, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 336, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 337, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 338, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jackal Pup", 183, Rarity.UNCOMMON, mage.cards.j.JackalPup.class));
        cards.add(new SetCardInfo("Jet Medallion", 292, Rarity.RARE, mage.cards.j.JetMedallion.class));
        cards.add(new SetCardInfo("Jinxed Idol", 293, Rarity.RARE, mage.cards.j.JinxedIdol.class));
        cards.add(new SetCardInfo("Kezzerdrix", 139, Rarity.RARE, mage.cards.k.Kezzerdrix.class));
        cards.add(new SetCardInfo("Kindle", 184, Rarity.COMMON, mage.cards.k.Kindle.class));
        cards.add(new SetCardInfo("Knight of Dawn", 26, Rarity.UNCOMMON, mage.cards.k.KnightOfDawn.class));
        cards.add(new SetCardInfo("Knight of Dusk", 140, Rarity.UNCOMMON, mage.cards.k.KnightOfDusk.class));
        cards.add(new SetCardInfo("Krakilin", 235, Rarity.UNCOMMON, mage.cards.k.Krakilin.class));
        cards.add(new SetCardInfo("Leeching Licid", 141, Rarity.UNCOMMON, mage.cards.l.LeechingLicid.class));
        cards.add(new SetCardInfo("Legacy's Allure", 71, Rarity.UNCOMMON, mage.cards.l.LegacysAllure.class));
        cards.add(new SetCardInfo("Legerdemain", 72, Rarity.UNCOMMON, mage.cards.l.Legerdemain.class));
        cards.add(new SetCardInfo("Light of Day", 27, Rarity.UNCOMMON, mage.cards.l.LightOfDay.class));
        cards.add(new SetCardInfo("Lightning Blast", 185, Rarity.COMMON, mage.cards.l.LightningBlast.class));
        cards.add(new SetCardInfo("Lightning Elemental", 186, Rarity.COMMON, mage.cards.l.LightningElemental.class));
        cards.add(new SetCardInfo("Living Death", 142, Rarity.RARE, mage.cards.l.LivingDeath.class));
        cards.add(new SetCardInfo("Lobotomy", 267, Rarity.UNCOMMON, mage.cards.l.Lobotomy.class));
        cards.add(new SetCardInfo("Lotus Petal", 294, Rarity.COMMON, mage.cards.l.LotusPetal.class));
        cards.add(new SetCardInfo("Lowland Giant", 187, Rarity.COMMON, mage.cards.l.LowlandGiant.class));
        cards.add(new SetCardInfo("Maddening Imp", 143, Rarity.RARE, mage.cards.m.MaddeningImp.class));
        cards.add(new SetCardInfo("Magmasaur", 188, Rarity.RARE, mage.cards.m.Magmasaur.class));
        cards.add(new SetCardInfo("Mana Severance", 73, Rarity.RARE, mage.cards.m.ManaSeverance.class));
        cards.add(new SetCardInfo("Manakin", 296, Rarity.COMMON, mage.cards.m.Manakin.class));
        cards.add(new SetCardInfo("Manta Riders", 74, Rarity.COMMON, mage.cards.m.MantaRiders.class));
        cards.add(new SetCardInfo("Marble Titan", 28, Rarity.RARE, mage.cards.m.MarbleTitan.class));
        cards.add(new SetCardInfo("Marsh Lurker", 144, Rarity.COMMON, mage.cards.m.MarshLurker.class));
        cards.add(new SetCardInfo("Master Decoy", 29, Rarity.COMMON, mage.cards.m.MasterDecoy.class));
        cards.add(new SetCardInfo("Mawcor", 75, Rarity.RARE, mage.cards.m.Mawcor.class));
        cards.add(new SetCardInfo("Maze of Shadows", 319, Rarity.UNCOMMON, mage.cards.m.MazeOfShadows.class));
        cards.add(new SetCardInfo("Meditate", 76, Rarity.RARE, mage.cards.m.Meditate.class));
        cards.add(new SetCardInfo("Metallic Sliver", 297, Rarity.COMMON, mage.cards.m.MetallicSliver.class));
        cards.add(new SetCardInfo("Mindwhip Sliver", 145, Rarity.UNCOMMON, mage.cards.m.MindwhipSliver.class));
        cards.add(new SetCardInfo("Minion of the Wastes", 146, Rarity.RARE, mage.cards.m.MinionOfTheWastes.class));
        cards.add(new SetCardInfo("Mirri's Guile", 236, Rarity.RARE, mage.cards.m.MirrisGuile.class));
        cards.add(new SetCardInfo("Mnemonic Sliver", 77, Rarity.UNCOMMON, mage.cards.m.MnemonicSliver.class));
        cards.add(new SetCardInfo("Mogg Cannon", 298, Rarity.UNCOMMON, mage.cards.m.MoggCannon.class));
        cards.add(new SetCardInfo("Mogg Conscripts", 189, Rarity.COMMON, mage.cards.m.MoggConscripts.class));
        cards.add(new SetCardInfo("Mogg Fanatic", 190, Rarity.COMMON, mage.cards.m.MoggFanatic.class));
        cards.add(new SetCardInfo("Mogg Hollows", 320, Rarity.UNCOMMON, mage.cards.m.MoggHollows.class));
        cards.add(new SetCardInfo("Mogg Raider", 191, Rarity.COMMON, mage.cards.m.MoggRaider.class));
        cards.add(new SetCardInfo("Mogg Squad", 192, Rarity.UNCOMMON, mage.cards.m.MoggSquad.class));
        cards.add(new SetCardInfo("Mongrel Pack", 237, Rarity.RARE, mage.cards.m.MongrelPack.class));
        cards.add(new SetCardInfo("Mountain", 343, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 344, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 345, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 346, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mounted Archers", 30, Rarity.COMMON, mage.cards.m.MountedArchers.class));
        cards.add(new SetCardInfo("Muscle Sliver", 238, Rarity.COMMON, mage.cards.m.MuscleSliver.class));
        cards.add(new SetCardInfo("Natural Spring", 239, Rarity.COMMON, mage.cards.n.NaturalSpring.class));
        cards.add(new SetCardInfo("Nature's Revolt", 240, Rarity.RARE, mage.cards.n.NaturesRevolt.class));
        cards.add(new SetCardInfo("Needle Storm", 241, Rarity.UNCOMMON, mage.cards.n.NeedleStorm.class));
        cards.add(new SetCardInfo("Nurturing Licid", 242, Rarity.UNCOMMON, mage.cards.n.NurturingLicid.class));
        cards.add(new SetCardInfo("Opportunist", 194, Rarity.UNCOMMON, mage.cards.o.Opportunist.class));
        cards.add(new SetCardInfo("Oracle en-Vec", 31, Rarity.RARE, mage.cards.o.OracleEnVec.class));
        cards.add(new SetCardInfo("Orim's Prayer", 32, Rarity.UNCOMMON, mage.cards.o.OrimsPrayer.class));
        cards.add(new SetCardInfo("Orim, Samite Healer", 33, Rarity.RARE, mage.cards.o.OrimSamiteHealer.class));
        cards.add(new SetCardInfo("Overrun", 243, Rarity.UNCOMMON, mage.cards.o.Overrun.class));
        cards.add(new SetCardInfo("Pacifism", 34, Rarity.COMMON, mage.cards.p.Pacifism.class));
        cards.add(new SetCardInfo("Pallimud", 195, Rarity.RARE, mage.cards.p.Pallimud.class));
        cards.add(new SetCardInfo("Patchwork Gnomes", 299, Rarity.UNCOMMON, mage.cards.p.PatchworkGnomes.class));
        cards.add(new SetCardInfo("Pearl Medallion", 300, Rarity.RARE, mage.cards.p.PearlMedallion.class));
        cards.add(new SetCardInfo("Pegasus Refuge", 35, Rarity.RARE, mage.cards.p.PegasusRefuge.class));
        cards.add(new SetCardInfo("Perish", 147, Rarity.UNCOMMON, mage.cards.p.Perish.class));
        cards.add(new SetCardInfo("Phyrexian Grimoire", 301, Rarity.RARE, mage.cards.p.PhyrexianGrimoire.class));
        cards.add(new SetCardInfo("Phyrexian Hulk", 302, Rarity.UNCOMMON, mage.cards.p.PhyrexianHulk.class));
        cards.add(new SetCardInfo("Phyrexian Splicer", 303, Rarity.UNCOMMON, mage.cards.p.PhyrexianSplicer.class));
        cards.add(new SetCardInfo("Pincher Beetles", 244, Rarity.COMMON, mage.cards.p.PincherBeetles.class));
        cards.add(new SetCardInfo("Pine Barrens", 321, Rarity.RARE, mage.cards.p.PineBarrens.class));
        cards.add(new SetCardInfo("Pit Imp", 148, Rarity.COMMON, mage.cards.p.PitImp.class));
        cards.add(new SetCardInfo("Plains", 331, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 332, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 333, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 334, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Power Sink", 78, Rarity.COMMON, mage.cards.p.PowerSink.class));
        cards.add(new SetCardInfo("Precognition", 79, Rarity.RARE, mage.cards.p.Precognition.class));
        cards.add(new SetCardInfo("Propaganda", 80, Rarity.UNCOMMON, mage.cards.p.Propaganda.class));
        cards.add(new SetCardInfo("Puppet Strings", 304, Rarity.UNCOMMON, mage.cards.p.PuppetStrings.class));
        cards.add(new SetCardInfo("Quickening Licid", 36, Rarity.UNCOMMON, mage.cards.q.QuickeningLicid.class));
        cards.add(new SetCardInfo("Rain of Tears", 149, Rarity.UNCOMMON, mage.cards.r.RainOfTears.class));
        cards.add(new SetCardInfo("Rampant Growth", 245, Rarity.COMMON, mage.cards.r.RampantGrowth.class));
        cards.add(new SetCardInfo("Ranger en-Vec", 268, Rarity.UNCOMMON, mage.cards.r.RangerEnVec.class));
        cards.add(new SetCardInfo("Rathi Dragon", 196, Rarity.RARE, mage.cards.r.RathiDragon.class));
        cards.add(new SetCardInfo("Rats of Rath", 150, Rarity.COMMON, mage.cards.r.RatsOfRath.class));
        cards.add(new SetCardInfo("Reality Anchor", 246, Rarity.COMMON, mage.cards.r.RealityAnchor.class));
        cards.add(new SetCardInfo("Reanimate", 151, Rarity.UNCOMMON, mage.cards.r.Reanimate.class));
        cards.add(new SetCardInfo("Reap", 247, Rarity.UNCOMMON, mage.cards.r.Reap.class));
        cards.add(new SetCardInfo("Reckless Spite", 152, Rarity.UNCOMMON, mage.cards.r.RecklessSpite.class));
        cards.add(new SetCardInfo("Recycle", 248, Rarity.RARE, mage.cards.r.Recycle.class));
        cards.add(new SetCardInfo("Reflecting Pool", 322, Rarity.RARE, mage.cards.r.ReflectingPool.class));
        cards.add(new SetCardInfo("Renegade Warlord", 197, Rarity.UNCOMMON, mage.cards.r.RenegadeWarlord.class));
        cards.add(new SetCardInfo("Repentance", 37, Rarity.UNCOMMON, mage.cards.r.Repentance.class));
        cards.add(new SetCardInfo("Respite", 249, Rarity.COMMON, mage.cards.r.Respite.class));
        cards.add(new SetCardInfo("Rolling Thunder", 198, Rarity.COMMON, mage.cards.r.RollingThunder.class));
        cards.add(new SetCardInfo("Root Maze", 250, Rarity.RARE, mage.cards.r.RootMaze.class));
        cards.add(new SetCardInfo("Rootbreaker Wurm", 251, Rarity.COMMON, mage.cards.r.RootbreakerWurm.class));
        cards.add(new SetCardInfo("Rootwalla", 252, Rarity.COMMON, mage.cards.r.Rootwalla.class));
        cards.add(new SetCardInfo("Rootwater Depths", 323, Rarity.UNCOMMON, mage.cards.r.RootwaterDepths.class));
        cards.add(new SetCardInfo("Rootwater Diver", 81, Rarity.UNCOMMON, mage.cards.r.RootwaterDiver.class));
        cards.add(new SetCardInfo("Rootwater Hunter", 82, Rarity.COMMON, mage.cards.r.RootwaterHunter.class));
        cards.add(new SetCardInfo("Rootwater Matriarch", 83, Rarity.RARE, mage.cards.r.RootwaterMatriarch.class));
        cards.add(new SetCardInfo("Rootwater Shaman", 84, Rarity.RARE, mage.cards.r.RootwaterShaman.class));
        cards.add(new SetCardInfo("Ruby Medallion", 305, Rarity.RARE, mage.cards.r.RubyMedallion.class));
        cards.add(new SetCardInfo("Sacred Guide", 38, Rarity.RARE, mage.cards.s.SacredGuide.class));
        cards.add(new SetCardInfo("Sadistic Glee", 153, Rarity.COMMON, mage.cards.s.SadisticGlee.class));
        cards.add(new SetCardInfo("Safeguard", 39, Rarity.RARE, mage.cards.s.Safeguard.class));
        cards.add(new SetCardInfo("Salt Flats", 324, Rarity.RARE, mage.cards.s.SaltFlats.class));
        cards.add(new SetCardInfo("Sandstone Warrior", 199, Rarity.COMMON, mage.cards.s.SandstoneWarrior.class));
        cards.add(new SetCardInfo("Sapphire Medallion", 306, Rarity.RARE, mage.cards.s.SapphireMedallion.class));
        cards.add(new SetCardInfo("Sarcomancy", 154, Rarity.RARE, mage.cards.s.Sarcomancy.class));
        cards.add(new SetCardInfo("Scabland", 325, Rarity.RARE, mage.cards.s.Scabland.class));
        cards.add(new SetCardInfo("Scalding Tongs", 307, Rarity.RARE, mage.cards.s.ScaldingTongs.class));
        cards.add(new SetCardInfo("Scorched Earth", 200, Rarity.RARE, mage.cards.s.ScorchedEarth.class));
        cards.add(new SetCardInfo("Scragnoth", 253, Rarity.UNCOMMON, mage.cards.s.Scragnoth.class));
        cards.add(new SetCardInfo("Screeching Harpy", 155, Rarity.UNCOMMON, mage.cards.s.ScreechingHarpy.class));
        cards.add(new SetCardInfo("Scroll Rack", 308, Rarity.RARE, mage.cards.s.ScrollRack.class));
        cards.add(new SetCardInfo("Sea Monster", 85, Rarity.COMMON, mage.cards.s.SeaMonster.class));
        cards.add(new SetCardInfo("Searing Touch", 201, Rarity.UNCOMMON, mage.cards.s.SearingTouch.class));
        cards.add(new SetCardInfo("Seeker of Skybreak", 254, Rarity.COMMON, mage.cards.s.SeekerOfSkybreak.class));
        cards.add(new SetCardInfo("Segmented Wurm", 269, Rarity.UNCOMMON, mage.cards.s.SegmentedWurm.class));
        cards.add(new SetCardInfo("Selenia, Dark Angel", 270, Rarity.RARE, mage.cards.s.SeleniaDarkAngel.class));
        cards.add(new SetCardInfo("Serene Offering", 40, Rarity.UNCOMMON, mage.cards.s.SereneOffering.class));
        cards.add(new SetCardInfo("Servant of Volrath", 156, Rarity.COMMON, mage.cards.s.ServantOfVolrath.class));
        cards.add(new SetCardInfo("Shadow Rift", 86, Rarity.COMMON, mage.cards.s.ShadowRift.class));
        cards.add(new SetCardInfo("Shadowstorm", 202, Rarity.UNCOMMON, mage.cards.s.Shadowstorm.class));
        cards.add(new SetCardInfo("Shatter", 203, Rarity.COMMON, mage.cards.s.Shatter.class));
        cards.add(new SetCardInfo("Shimmering Wings", 87, Rarity.COMMON, mage.cards.s.ShimmeringWings.class));
        cards.add(new SetCardInfo("Shocker", 204, Rarity.RARE, mage.cards.s.Shocker.class));
        cards.add(new SetCardInfo("Sky Spirit", 271, Rarity.UNCOMMON, mage.cards.s.SkySpirit.class));
        cards.add(new SetCardInfo("Skyshroud Condor", 88, Rarity.UNCOMMON, mage.cards.s.SkyshroudCondor.class));
        cards.add(new SetCardInfo("Skyshroud Elf", 255, Rarity.COMMON, mage.cards.s.SkyshroudElf.class));
        cards.add(new SetCardInfo("Skyshroud Forest", 326, Rarity.RARE, mage.cards.s.SkyshroudForest.class));
        cards.add(new SetCardInfo("Skyshroud Ranger", 256, Rarity.COMMON, mage.cards.s.SkyshroudRanger.class));
        cards.add(new SetCardInfo("Skyshroud Troll", 257, Rarity.COMMON, mage.cards.s.SkyshroudTroll.class));
        cards.add(new SetCardInfo("Skyshroud Vampire", 157, Rarity.UNCOMMON, mage.cards.s.SkyshroudVampire.class));
        cards.add(new SetCardInfo("Soltari Crusader", 41, Rarity.UNCOMMON, mage.cards.s.SoltariCrusader.class));
        cards.add(new SetCardInfo("Soltari Emissary", 42, Rarity.RARE, mage.cards.s.SoltariEmissary.class));
        cards.add(new SetCardInfo("Soltari Foot Soldier", 43, Rarity.COMMON, mage.cards.s.SoltariFootSoldier.class));
        cards.add(new SetCardInfo("Soltari Guerrillas", 272, Rarity.RARE, mage.cards.s.SoltariGuerrillas.class));
        cards.add(new SetCardInfo("Soltari Lancer", 44, Rarity.COMMON, mage.cards.s.SoltariLancer.class));
        cards.add(new SetCardInfo("Soltari Monk", 45, Rarity.UNCOMMON, mage.cards.s.SoltariMonk.class));
        cards.add(new SetCardInfo("Soltari Priest", 46, Rarity.UNCOMMON, mage.cards.s.SoltariPriest.class));
        cards.add(new SetCardInfo("Soltari Trooper", 47, Rarity.COMMON, mage.cards.s.SoltariTrooper.class));
        cards.add(new SetCardInfo("Souldrinker", 158, Rarity.UNCOMMON, mage.cards.s.Souldrinker.class));
        cards.add(new SetCardInfo("Spell Blast", 89, Rarity.COMMON, mage.cards.s.SpellBlast.class));
        cards.add(new SetCardInfo("Spike Drone", 258, Rarity.COMMON, mage.cards.s.SpikeDrone.class));
        cards.add(new SetCardInfo("Spinal Graft", 159, Rarity.COMMON, mage.cards.s.SpinalGraft.class));
        cards.add(new SetCardInfo("Spirit Mirror", 48, Rarity.RARE, mage.cards.s.SpiritMirror.class));
        cards.add(new SetCardInfo("Spontaneous Combustion", 273, Rarity.UNCOMMON, mage.cards.s.SpontaneousCombustion.class));
        cards.add(new SetCardInfo("Squee's Toy", 309, Rarity.COMMON, mage.cards.s.SqueesToy.class));
        cards.add(new SetCardInfo("Stalking Stones", 327, Rarity.UNCOMMON, mage.cards.s.StalkingStones.class));
        cards.add(new SetCardInfo("Starke of Rath", 205, Rarity.RARE, mage.cards.s.StarkeOfRath.class));
        cards.add(new SetCardInfo("Static Orb", 310, Rarity.RARE, mage.cards.s.StaticOrb.class));
        cards.add(new SetCardInfo("Staunch Defenders", 49, Rarity.UNCOMMON, mage.cards.s.StaunchDefenders.class));
        cards.add(new SetCardInfo("Steal Enchantment", 90, Rarity.UNCOMMON, mage.cards.s.StealEnchantment.class));
        cards.add(new SetCardInfo("Stinging Licid", 91, Rarity.UNCOMMON, mage.cards.s.StingingLicid.class));
        cards.add(new SetCardInfo("Stone Rain", 206, Rarity.COMMON, mage.cards.s.StoneRain.class));
        cards.add(new SetCardInfo("Storm Front", 259, Rarity.UNCOMMON, mage.cards.s.StormFront.class));
        cards.add(new SetCardInfo("Stun", 207, Rarity.COMMON, mage.cards.s.Stun.class));
        cards.add(new SetCardInfo("Sudden Impact", 208, Rarity.UNCOMMON, mage.cards.s.SuddenImpact.class));
        cards.add(new SetCardInfo("Swamp", 339, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 340, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 341, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 342, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tahngarth's Rage", 209, Rarity.UNCOMMON, mage.cards.t.TahngarthsRage.class));
        cards.add(new SetCardInfo("Talon Sliver", 50, Rarity.COMMON, mage.cards.t.TalonSliver.class));
        cards.add(new SetCardInfo("Telethopter", 311, Rarity.UNCOMMON, mage.cards.t.Telethopter.class));
        cards.add(new SetCardInfo("Thalakos Dreamsower", 92, Rarity.UNCOMMON, mage.cards.t.ThalakosDreamsower.class));
        cards.add(new SetCardInfo("Thalakos Lowlands", 328, Rarity.UNCOMMON, mage.cards.t.ThalakosLowlands.class));
        cards.add(new SetCardInfo("Thalakos Mistfolk", 93, Rarity.COMMON, mage.cards.t.ThalakosMistfolk.class));
        cards.add(new SetCardInfo("Thalakos Seer", 94, Rarity.COMMON, mage.cards.t.ThalakosSeer.class));
        cards.add(new SetCardInfo("Thalakos Sentry", 95, Rarity.COMMON, mage.cards.t.ThalakosSentry.class));
        cards.add(new SetCardInfo("Thumbscrews", 312, Rarity.RARE, mage.cards.t.Thumbscrews.class));
        cards.add(new SetCardInfo("Time Ebb", 96, Rarity.COMMON, mage.cards.t.TimeEbb.class));
        cards.add(new SetCardInfo("Time Warp", 97, Rarity.RARE, mage.cards.t.TimeWarp.class));
        cards.add(new SetCardInfo("Tooth and Claw", 210, Rarity.RARE, mage.cards.t.ToothAndClaw.class));
        cards.add(new SetCardInfo("Torture Chamber", 313, Rarity.RARE, mage.cards.t.TortureChamber.class));
        cards.add(new SetCardInfo("Tradewind Rider", 98, Rarity.RARE, mage.cards.t.TradewindRider.class));
        cards.add(new SetCardInfo("Trained Armodon", 260, Rarity.COMMON, mage.cards.t.TrainedArmodon.class));
        cards.add(new SetCardInfo("Tranquility", 261, Rarity.COMMON, mage.cards.t.Tranquility.class));
        cards.add(new SetCardInfo("Trumpeting Armodon", 262, Rarity.UNCOMMON, mage.cards.t.TrumpetingArmodon.class));
        cards.add(new SetCardInfo("Twitch", 99, Rarity.COMMON, mage.cards.t.Twitch.class));
        cards.add(new SetCardInfo("Unstable Shapeshifter", 100, Rarity.RARE, mage.cards.u.UnstableShapeshifter.class));
        cards.add(new SetCardInfo("Vec Townships", 329, Rarity.UNCOMMON, mage.cards.v.VecTownships.class));
        cards.add(new SetCardInfo("Verdant Force", 263, Rarity.RARE, mage.cards.v.VerdantForce.class));
        cards.add(new SetCardInfo("Verdigris", 264, Rarity.UNCOMMON, mage.cards.v.Verdigris.class));
        cards.add(new SetCardInfo("Vhati il-Dal", 274, Rarity.RARE, mage.cards.v.VhatiIlDal.class));
        cards.add(new SetCardInfo("Volrath's Curse", 101, Rarity.COMMON, mage.cards.v.VolrathsCurse.class));
        cards.add(new SetCardInfo("Wall of Diffusion", 211, Rarity.COMMON, mage.cards.w.WallOfDiffusion.class));
        cards.add(new SetCardInfo("Warmth", 51, Rarity.UNCOMMON, mage.cards.w.Warmth.class));
        cards.add(new SetCardInfo("Wasteland", 330, Rarity.UNCOMMON, mage.cards.w.Wasteland.class));
        cards.add(new SetCardInfo("Watchdog", 314, Rarity.UNCOMMON, mage.cards.w.Watchdog.class));
        cards.add(new SetCardInfo("Whispers of the Muse", 103, Rarity.UNCOMMON, mage.cards.w.WhispersOfTheMuse.class));
        cards.add(new SetCardInfo("Wild Wurm", 212, Rarity.UNCOMMON, mage.cards.w.WildWurm.class));
        cards.add(new SetCardInfo("Wind Dancer", 104, Rarity.UNCOMMON, mage.cards.w.WindDancer.class));
        cards.add(new SetCardInfo("Wind Drake", 105, Rarity.COMMON, mage.cards.w.WindDrake.class));
        cards.add(new SetCardInfo("Winds of Rath", 52, Rarity.RARE, mage.cards.w.WindsOfRath.class));
        cards.add(new SetCardInfo("Winged Sliver", 106, Rarity.COMMON, mage.cards.w.WingedSliver.class));
        cards.add(new SetCardInfo("Winter's Grasp", 265, Rarity.UNCOMMON, mage.cards.w.WintersGrasp.class));
        cards.add(new SetCardInfo("Wood Sage", 275, Rarity.RARE, mage.cards.w.WoodSage.class));
        cards.add(new SetCardInfo("Worthy Cause", 53, Rarity.UNCOMMON, mage.cards.w.WorthyCause.class));
    }

    @Override
    public BoosterCollator createCollator() {
        return new TempestCollator();
    }
}

// Booster collation info from https://www.lethe.xyz/mtg/collation/tmp.html
// Using common collation
class TempestCollator implements BoosterCollator {
    private final CardRun commonA = new CardRun(true, "129", "226", "185", "105", "23", "137", "252", "173", "57", "34", "129", "244", "190", "78", "23", "132", "252", "198", "105", "16", "113", "257", "186", "78", "29", "128", "216", "173", "67", "3", "117", "251", "190", "57", "29", "113", "216", "184", "82", "15", "132", "257", "198", "85", "34", "128", "251", "185", "67", "15", "117", "226", "186", "82", "3", "137", "244", "184", "85", "16");
    private final CardRun commonB = new CardRun(true, "296", "258", "189", "11", "86", "309", "256", "191", "30", "106", "159", "294", "199", "10", "93", "112", "297", "207", "30", "55", "122", "261", "296", "5", "106", "119", "228", "309", "10", "74", "122", "249", "191", "279", "55", "119", "261", "164", "297", "86", "126", "256", "199", "11", "294", "112", "249", "189", "43", "74", "159", "258", "207", "5", "93", "126", "228", "164", "43", "279");
    private final CardRun commonC = new CardRun(true, "133", "238", "167", "99", "14", "134", "255", "211", "66", "17", "144", "245", "174", "89", "1", "133", "260", "160", "66", "44", "144", "217", "167", "59", "47", "148", "245", "187", "89", "14", "123", "260", "211", "96", "17", "134", "238", "174", "59", "1", "148", "217", "160", "99", "44", "123", "255", "187", "96", "47");
    private final CardRun commonD = new CardRun(true, "109", "215", "182", "101", "13", "150", "239", "206", "94", "12", "118", "254", "169", "95", "9", "153", "231", "203", "87", "8", "150", "246", "182", "65", "12", "156", "239", "178", "95", "50", "153", "215", "203", "101", "8", "109", "254", "206", "87", "13", "118", "231", "178", "94", "50", "156", "246", "169", "65", "9");
    private final CardRun uncommon = new CardRun(false, "107", "161", "315", "2", "214", "4", "163", "165", "278", "218", "56", "219", "317", "120", "121", "124", "125", "58", "130", "171", "286", "287", "63", "172", "227", "19", "175", "64", "20", "318", "179", "230", "181", "233", "234", "138", "68", "69", "25", "183", "26", "140", "235", "141", "71", "72", "27", "267", "319", "145", "77", "298", "320", "192", "241", "242", "194", "32", "243", "299", "147", "302", "303", "80", "304", "36", "149", "268", "151", "247", "152", "197", "37", "323", "81", "253", "155", "201", "269", "40", "202", "88", "157", "271", "41", "45", "46", "158", "273", "327", "49", "90", "91", "259", "208", "209", "311", "92", "328", "262", "329", "264", "51", "330", "314", "103", "212", "104", "265", "53");
    // excluding unimplemented rares 61|Ertai's Meddling, 102|Whim of Volrath, 193|No Quarter, 295|Magnetic Web
    private final CardRun rare = new CardRun(false, "276", "213", "162", "6", "7", "108", "54", "277", "110", "316", "166", "111", "168", "114", "280", "115", "116", "220", "281", "170", "127", "221", "266", "131", "60", "222", "282", "224", "223", "225", "283", "284", "285",       "62", "135", "136", "18", "288", "176", "289", "229", "177", "21", "290", "180", "22", "232", "291", "24", "70", "292", "293", "139", "142", "143", "188",        "73", "28", "75", "76", "146", "236", "237", "240",        "31", "33", "195", "300", "35", "301", "321", "79", "196", "248", "322", "250", "83", "84", "305", "38", "39", "324", "306", "154", "325", "307", "200", "308", "270", "204", "326", "42", "272", "48", "205", "310", "312", "97", "210", "313", "98", "100", "263", "274",        "52", "275");

    private final BoosterStructure AAABBB = new BoosterStructure(
            commonA, commonA, commonA,
            commonB, commonB, commonB
    );
    private final BoosterStructure BBBAAA = new BoosterStructure(
            commonB, commonB, commonB,
            commonA, commonA, commonA
    );
    private final BoosterStructure AAAABB = new BoosterStructure(
            commonA, commonA, commonA, commonA,
            commonB, commonB
    );
    private final BoosterStructure BBBBAA = new BoosterStructure(
            commonB, commonB, commonB, commonB,
            commonA, commonA
    );
    private final BoosterStructure CCCDD = new BoosterStructure(
            commonC, commonC, commonC,
            commonD, commonD
    );
    private final BoosterStructure DDDCC = new BoosterStructure(
            commonD, commonD, commonD,
            commonC, commonC
    );
    private final BoosterStructure CCDDD = new BoosterStructure(
            commonC, commonC,
            commonD, commonD, commonD
    );
    private final BoosterStructure DDCCC = new BoosterStructure(
            commonD, commonD,
            commonC, commonC, commonC
    );
    private final BoosterStructure U3 = new BoosterStructure(uncommon, uncommon, uncommon);
    private final BoosterStructure R1 = new BoosterStructure(rare);

    // https://www.lethe.xyz/mtg/collation/mir.html states a very rough estimate of the 4-2 rate is 1/3
    private final RarityConfiguration commonRunsAB = new RarityConfiguration(
        AAAABB,
        AAABBB, AAABBB,
        BBBAAA, BBBAAA,
        BBBBAA
    );
    private final RarityConfiguration commonRunsCD = new RarityConfiguration(
        CCCDD, DDDCC, CCDDD, DDCCC
    );
    private final RarityConfiguration uncommonRuns = new RarityConfiguration(U3);
    private final RarityConfiguration rareRuns = new RarityConfiguration(R1);

    @Override
    public List<String> makeBooster() {
        List<String> booster = new ArrayList<>();
        booster.addAll(commonRunsAB.getNext().makeRun());
        booster.addAll(commonRunsCD.getNext().makeRun());
        booster.addAll(uncommonRuns.getNext().makeRun());
        booster.addAll(rareRuns.getNext().makeRun());
        return booster;
    }
}

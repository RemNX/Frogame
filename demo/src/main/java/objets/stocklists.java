package objets;
public class stocklists {

    /* #region //!------Listes Joueurs----- */

    public static player[] listplayer = {
            new player("Cass", 1, 0, 500,1),
            new player("Rem", 1, 0, 500,2)
    };



    /* #endregion */

    /* #region //!------Listes cartes------ */
    public static type_card[][] listtype = {
        {//,0 star
            new type_card("Runes", 0, "", 2),
            new type_card("Grace site", 0, "", 2)
        },
        {//, 1 star
        new type_card("Pumpkin head", 1, "", 1),
        new type_card("Burial Watchdog", 1, "", 2),
        new type_card("Troll", 1, "", 2),
        new type_card("Grafted Scion", 1, "", 2),
        new type_card("Soldiers", 1, "", 2),
        new type_card("Beastmen", 1, "", 2),
        new type_card("Demi humans", 1, "", 2),
        new type_card("Runebear", 1, "", 2),
        new type_card("Crucible knight", 1, "", 2),
        new type_card("Knight of Zamor", 1, "", 2),
        new type_card("Tree Sentinel", 1, "", 2),
        new type_card("Black knife Assassin", 1, "", 2),
        new type_card("Crystalians", 1, "", 2),
        new type_card("Death Bird", 1, "", 2),
        new type_card("Tibia Mariner", 1, "", 2),
        new type_card("Bloodhound knight", 1, "", 2),
        new type_card("Priest of blood", 1, "", 2),
        new type_card("Erdtree Avatar", 1, "", 2),
        new type_card("Cleanrot Knight", 1, "", 2),
        new type_card("Spirit caller Snail", 1, "", 2),
        new type_card("Omen", 1, "", 2),
        new type_card("Ulcerated Tree Spirit", 1, "", 2),
        new type_card("Onyx lord", 1, "", 2),
        new type_card("Abductor Virgins", 1, "", 2),
        new type_card("Golem", 1, "", 2),
        new type_card("Falllingstar Beast", 1, "", 2),
        new type_card("Kindred of rot", 1, "", 2),
        new type_card("Magma Wyrm", 1, "", 2),
        new type_card("Misbegotten", 1, "", 2),
        new type_card("Wormface", 1, "", 2)

        },
        {//, 2 star
        new type_card("Alexander, Warrior Jar", 2, "", 1),
        new type_card("Bloody finger hunter Yura", 2, "", 1),
        new type_card("Aureliette", 2, "", 1),
        new type_card("Blackguard Big Boggart", 2, "", 1),
        new type_card("Boc the seamster", 2, "", 1),
        new type_card("Brother Corhyn", 2, "", 1),
        new type_card("Castellan Edgar", 2, "", 1),
        new type_card("Castellan Jerren", 2, "", 1),
        new type_card("Crucible Knight", 2, "", 1),
        new type_card("D, Beholder of Death", 2, "", 1),
        new type_card("D, Hunter of the Dead", 2, "", 1),
        new type_card("Eleonara, Violet Bloody Finger", 2, "", 1),
        new type_card("Ensha of the Royal Remains", 2, "", 1),
        new type_card("Gatekeeper Gostoc", 2, "", 1),
        new type_card("Great Horned Tragoth", 2, "", 1),
        new type_card("Gurranq, Beast Clergyman", 2, "", 1),
        new type_card("Irina of Morne", 2, "", 1),
        new type_card("Jar-Bairn", 2, "", 1),
        new type_card("Kenneth Haight", 2, "", 1),
        new type_card("Knight Diallos", 2, "", 1),
        new type_card("Latenna the Albinauric", 2, "", 1),
        new type_card("Lightseeker Hyetta", 2, "", 1),
        new type_card("Elemer of the Briar", 2, "", 1),
        new type_card("Cemetery Shade", 2, "", 1)
        },
        {//, 3 star
        new type_card("Blaidd the Half-Wolf", 3, "", 1),
        new type_card("Dung eater", 3, "", 1),
        new type_card("Fia, Deathbed Companion", 3, "", 1),
        new type_card("Finger Reader Enia", 3, "", 1),
        new type_card("Goldmask", 3, "", 1),
        new type_card("Loretta, Knight of the Haligtree", 3, "", 1),
        new type_card("Godskin Duo", 3, "", 1),
        new type_card("Valiant GArgoyle", 3, "", 1),
        new type_card("Decaying Ezykes", 3, "", 1),
        new type_card("Borealis the Freezing fog", 3, "", 1),
        new type_card("Glinstone dragon Adula", 3, "", 1),
        new type_card("Red Wolf of Radagon", 3, "", 1),
        new type_card("Dragonskin Soldier of nokstella", 3, "", 1),
        new type_card("Flying dragon Agheel", 3, "", 1),
        new type_card("Sir Gideon Ofnir the All-Knowing", 3, "", 1)
        },
        {//, 4 star
        new type_card("Morgott the Omen King", 4, "", 1),
        new type_card("Mohg, Lord of Blood", 4, "", 1),
        new type_card("Godrick the Grafted", 4, "", 1),
        new type_card("Rennala, Queen of the Full Moon", 4, "", 1),
        new type_card("Regal Ancestor Spirit", 4, "", 1),
        new type_card("Starscourge Radhan", 4, "", 1),
        new type_card("Astel Naturalborn of the Void", 4, "", 1),
        new type_card("Lichdragon Fortissax", 4, "", 1),
        new type_card("Rykard Lord of Blasphemy", 4, "", 1),
        new type_card("Malenia Blade of Miquella", 4, "", 1),
        new type_card("Maliketh the Black Blade", 4, "", 1),
        new type_card("Godwyn the Golden", 4, "", 1),
        new type_card("Miquella of the Haligtree", 4, "", 1),
        new type_card("Ranni the Witch", 4, "", 1),
        new type_card("Fire Giant", 4, "", 1)
        },
        {//, 5 star
        new type_card("Dragonlord Placidusax", 5, "", 1),
        new type_card("Godfrey, First Elden Lord", 5, "", 1),
        new type_card("Radagon of the Golden Order", 5, "", 1),
        new type_card("A simple Tarnished", 5, "", 1),
        new type_card("Elden Beast", 5, "", 1)

        },
        {//, 6 star
        new type_card("Queen Marika the Eternal", 6, "", 1)
        }
    };
    /* #endregion */

    /* #region //!------Listes Boosters------*/

    public static booster[] listbooster = {
        new booster("simple", 200, new double[] {60,30,10,1,.1,0}),
        new booster("upgrade", 1000, new double[] { .18, .23, .43, .01, 0.199, 0.0001, 0 }),
        new booster("legendary", 4000, new double[] { .05, .1, .3, .45, 0.099, .001, 0 }),
        new booster("ultimate", 20000, new double[] { 0, .02, .08, .4, 0.495, 0.005, 0 })
    };
    /* #endregion */

}

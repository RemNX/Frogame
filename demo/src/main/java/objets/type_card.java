package objets;
public class type_card {
    /* #region //?----attributs---- */
    private String name;
    private int rarity;
    private String description;
    private int id; // créer class extension, nombre
    /* #endregion */

    /* #region //?---constructeurs----- */
    public type_card(String name, int rarity, String description, int id) {
        this.setname(name);
        this.setrarity(rarity);
        this.setdesc(description);
        this.setid(id);
    }
    /* #endregion */

    /* #region //?----Modificateurs--- */
    public void setname(String name) {
        this.name = name;
    }

    public void setrarity(int rarity) {
        if ((0 < rarity) || (rarity < 6)) {
            this.rarity = rarity;
        } else {
            System.err.println("rarity number is wrong (by default is a 1)");
        }
    }

    public void setdesc(String description) {
        this.description = description;
    }

    public void setid(int id) {
        this.id = id;
    }
    /* #endregion */

    /* #region //?----Accesseurs---- */
    public String getname() {
        return this.name;
    }

    public int getnrarity() {
        return this.rarity;
    }

    public String getdesc() {
        return this.description;
    }

    public int getid() {
        return this.id;
    }
    /* #endregion */

    /* #region //?----Méthodes----*/
    public String toString() {
        return this.name;
    }

    /* #endregion */
}
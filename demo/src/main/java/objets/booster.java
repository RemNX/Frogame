package objets;


public class booster {
    /* #region //?-----Attributs---- */
    private String name;
    private int price;
    private double[] drop;

    /* #endregion */

    /* #region //?----Constructeur---- */
    public booster(String name, int price, double[] drop) {
        this.setname(name);
        this.setprice(price);
        this.setdrop(drop);
    }

    /* #endregion */

    /* #region //?------Getter------ */
    public String getname() {
        return this.name;
    }

    public int getprice() {
        return this.price;
    }

    public double[] getdrop() {
        return this.drop;
    }
    /* #endregion */

    /* #region //?------Setter----- */
    public void setname(String name) {
        this.name = name;
    }

    public void setprice(int price) {
        this.price = price;
    }

    public void setdrop(double[] drop) {
        this.drop = drop;
    }
    /* #endregion */

    /* #region //?------Méthodes------*/

    /* #endregion */
}

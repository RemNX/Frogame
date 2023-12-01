package objets;
public class card {
    /* #region //?-------Attributs------*/
    private type_card type_card;
    private int nombre;
    private String niveau;
    private boolean holo;

    /* #endregion */

    /* #region //?------Constrcteurs */

    public card(type_card type) {
        this.settype(type);
        this.setnombre(1);
        this.setholo(false);
        this.setniv("classique");
    }

    public card(type_card type, int nombre) {
        this.settype(type);
        this.setnombre(nombre);
        this.setholo(false);
        this.setniv("classique");
    }
    /* #endregion */

    /* #region //?------modificateurs----- */
    public void setnombre(int nombre) {
        this.nombre = nombre;
    }

    public void setholo(boolean holo) {
        this.holo = holo;
    }

    public void setniv(String niveau) {
        this.niveau = niveau;
    }

    public void settype(type_card type) {
        this.type_card=type;
    }
    /* #endregion */

    /* #region //?------Accesseurs------- */
    public int getnombre() {
        return this.nombre;
    }

    public boolean getholo() {
        return this.holo;
    }

    public String getniveau() {
        return this.niveau;
    }

    public type_card gettype() {
        return this.type_card;
    }
    /* #endregion */

    /* #region //?------Méthodes--------- */

    public void class2Bronze() {
        if ((this.getniveau() == "classique") && (((this.gettype().getnrarity() == 1) && (this.getnombre() >= 100)) ||
                ((this.gettype().getnrarity() == 2) && (this.getnombre() >= 50)) ||
                ((this.gettype().getnrarity() == 3) && (this.getnombre() >= 15)) ||
                ((this.gettype().getnrarity() == 4) && (this.getnombre() >= 5)) ||
                ((this.gettype().getnrarity() == 5) && (this.getnombre() >= 3)) ||
                ((this.gettype().getnrarity() == 6) && (this.getnombre() >= 2)))) {
            this.setniv("bronze");
        } else {
            System.out.println("pas assez de carte ou deja Bronze");
        }
    }

    public void Bronze2Argent() {
        if ((this.getniveau() == "bronze") && (((this.gettype().getnrarity() == 1) && (this.getnombre() >= 400)) ||
                ((this.gettype().getnrarity() == 2) && (this.getnombre() >= 100)) ||
                ((this.gettype().getnrarity() == 3) && (this.getnombre() >= 35)) ||
                ((this.gettype().getnrarity() == 4) && (this.getnombre() >= 12)) ||
                ((this.gettype().getnrarity() == 5) && (this.getnombre() >= 7)) ||
                ((this.gettype().getnrarity() == 6) && (this.getnombre() >= 4)))) {
            this.setniv("argent");
        } else {
            System.out.println("pas assez de carte ou deja Argent");
        }
    }

    public void Argent2Or() {
        if ((this.getniveau() == "argent") && (((this.gettype().getnrarity() == 1) && (this.getnombre() >= 1000)) ||
                ((this.gettype().getnrarity() == 2) && (this.getnombre() >= 250)) ||
                ((this.gettype().getnrarity() == 3) && (this.getnombre() >= 70)) ||
                ((this.gettype().getnrarity() == 4) && (this.getnombre() >= 30)) ||
                ((this.gettype().getnrarity() == 5) && (this.getnombre() >= 12)) ||
                ((this.gettype().getnrarity() == 6) && (this.getnombre() >= 7)))) {
            this.setniv("or");
        } else {
            System.out.println("pas assez de carte ou deja or");
        }
    }

    public void Or2Platine() {
        if ((this.getniveau() == "or") && (((this.gettype().getnrarity() == 1) && (this.getnombre() >= 3000)) ||
                ((this.gettype().getnrarity() == 2) && (this.getnombre() >= 600)) ||
                ((this.gettype().getnrarity() == 3) && (this.getnombre() >= 200)) ||
                ((this.gettype().getnrarity() == 4) && (this.getnombre() >= 60)) ||
                ((this.gettype().getnrarity() == 5) && (this.getnombre() >= 25)) ||
                ((this.gettype().getnrarity() == 6) && (this.getnombre() >= 15)))) {
            this.setniv("platine");
        } else {
            System.out.println("pas assez de carte ou deja platine");
        }
    }

    /* #endregion */
}

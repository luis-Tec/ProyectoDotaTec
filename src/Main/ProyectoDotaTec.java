/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entities.*;
import Interface.*;

/**
 *
 * @author User
 */
public class ProyectoDotaTec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Users yo = new Users("Emmanuel", "Emmanuel", "123", 19);
        UserLogin.Methods.AddNewUser(yo);

        Users me2 = new Users("Armando", "Armando", "1234", 19);
        UserLogin.Methods.AddNewUser(me2);

        Abilities e = new Abilities(50, 75, "SHRAPNEL");
        Abilities e2 = new Abilities(60, 80, "HEADSHOT");
        Abilities e3 = new Abilities(80, 120, "TAKE AIM");

        GroundCharacter g = new GroundCharacter("GroundDestructor", "ground");
        g.setDamage(10000);
        g.getGroundAbilities().add(e);
        g.getGroundAbilities().add(e2);
        g.getGroundAbilities().add(e3);

        GroundCharacter g2 = new GroundCharacter("HUSKAR", "ground");
        g2.getGroundAbilities().add(e);
        g2.getGroundAbilities().add(e2);
        g2.getGroundAbilities().add(e3);

        FireCharacter f = new FireCharacter("FireDestructor", "fire");
        f.setDamage(10000);
        f.getFireAbilities().add(e);
        f.getFireAbilities().add(e2);
        f.getFireAbilities().add(e3);

        FireCharacter f2 = new FireCharacter("SNIPER", "fire");
        f2.getFireAbilities().add(e);
        f2.getFireAbilities().add(e2);
        f2.getFireAbilities().add(e3);

        WaterCharacter w = new WaterCharacter("PUGNA", "water");
        w.getWaterAbilities().add(e);
        w.getWaterAbilities().add(e2);
        w.getWaterAbilities().add(e3);

        WaterCharacter w2 = new WaterCharacter("SLARK", "water");
        w2.getWaterAbilities().add(e);
        w2.getWaterAbilities().add(e2);
        w2.getWaterAbilities().add(e3);

        yo.getCharacters().add(g);
        yo.getCharacters().add(g2);
        yo.getCharacters().add(f);
        yo.getCharacters().add(f2);
        yo.getCharacters().add(w);
        yo.getCharacters().add(w2);

        me2.getCharacters().add(g);
        me2.getCharacters().add(g2);
        me2.getCharacters().add(f);
        me2.getCharacters().add(f2);
        me2.getCharacters().add(w);
        me2.getCharacters().add(w2);

        UserLogin.UserLoginInterface.setVisible(true);
    }

}

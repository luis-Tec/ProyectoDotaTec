/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import Entities.*;
import Interface.*;
import static Interface.AttackCharacter.jComboBoxAbilities;
import static Interface.Game.*;
import static Interface.PlayGame.*;
import static Interface.UserLogin.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Methods {
    //Global ArrayList

    public ArrayList<Users> UsersList = new ArrayList<Users>();

//Users methods
    //Add user to UserList
    public void AddNewUser(Users users) {
        UsersList.add(users);
    }

    public Users LoginUsers(String NickName, String PassWord) {
        for (Users users : UsersList) {

            if (users.getNickName().equals(NickName) && users.getPassWord().equals(PassWord)) {
                return users;
            }
        }
        return null;
    }

    public boolean validateNickNameUser(String nickName) {
        for (Users users : UsersList) {
            if (users.getNickName().equalsIgnoreCase(nickName)) {
                return true;
            }
        }
        return false;
    }

//Character methods
    //Create a Character with his abilities
    public void createCharacter(String name, String elem, String nameA, int damage, int cost, String nameA2, int damage2, int cost2, String nameA3, int damage3, int cost3) {
        switch (elem.toLowerCase()) {
            case "ground":
                GroundCharacter c = new GroundCharacter(name, elem);
                Abilities a = new Abilities(cost, damage, nameA);
                Abilities a2 = new Abilities(cost2, damage2, nameA2);
                Abilities a3 = new Abilities(cost3, damage3, nameA3);
                c.getGroundAbilities().add(a);
                c.getGroundAbilities().add(a2);
                c.getGroundAbilities().add(a3);
                UsersBackup.getCharacters().add(c);
                break;

            case "fire":
                FireCharacter f = new FireCharacter(name, elem);
                Abilities a4 = new Abilities(cost, damage, nameA);
                Abilities a5 = new Abilities(cost2, damage2, nameA2);
                Abilities a6 = new Abilities(cost3, damage3, nameA3);
                f.getFireAbilities().add(a4);
                f.getFireAbilities().add(a5);
                f.getFireAbilities().add(a6);
                UsersBackup.getCharacters().add(f);
                break;

            case "water":
                WaterCharacter w = new WaterCharacter(name, elem);
                Abilities a7 = new Abilities(cost, damage, nameA);
                Abilities a8 = new Abilities(cost2, damage2, nameA2);
                Abilities a9 = new Abilities(cost3, damage3, nameA3);
                w.getWaterAbilities().add(a7);
                w.getWaterAbilities().add(a8);
                w.getWaterAbilities().add(a9);
                UsersBackup.getCharacters().add(w);
                break;

            case "wind":
                WindCharacter wi = new WindCharacter(name, elem);
                Abilities a10 = new Abilities(cost, damage, nameA);
                Abilities a11 = new Abilities(cost2, damage2, nameA2);
                Abilities a12 = new Abilities(cost3, damage3, nameA3);
                wi.getWindAbilities().add(a10);
                wi.getWindAbilities().add(a11);
                wi.getWindAbilities().add(a12);
                UsersBackup.getCharacters().add(wi);
                break;

            default:
                System.out.println("That element of character doesn't exist");
                break;
        }
    }

    public GroundCharacter searchGroundCaracter(String name, String elem) {
        for (int i = 0; i < UsersBackup.getCharacters().size(); i++) {
            if ((UsersBackup.getCharacters().get(i).getName().equalsIgnoreCase(name)) && (UsersBackup.getCharacters().get(i).getElement().equalsIgnoreCase(elem))) {
                return (GroundCharacter) UsersBackup.getCharacters().get(i);
            }
        }
        return null;
    }

    public FireCharacter searchFireCaracter(String name, String elem) {
        for (int i = 0; i < UsersBackup.getCharacters().size(); i++) {
            if ((UsersBackup.getCharacters().get(i).getName().equalsIgnoreCase(name)) && (UsersBackup.getCharacters().get(i).getElement().equalsIgnoreCase(elem))) {
                return (FireCharacter) UsersBackup.getCharacters().get(i);
            }
        }
        return null;
    }

    public WaterCharacter searchWaterCaracter(String name, String elem) {
        for (int i = 0; i < UsersBackup.getCharacters().size(); i++) {
            if ((UsersBackup.getCharacters().get(i).getName().equalsIgnoreCase(name)) && (UsersBackup.getCharacters().get(i).getElement().equalsIgnoreCase(elem))) {
                return (WaterCharacter) UsersBackup.getCharacters().get(i);
            }
        }
        return null;
    }

    public WindCharacter searchWindCaracter(String name, String elem) {
        for (int i = 0; i < UsersBackup.getCharacters().size(); i++) {
            if ((UsersBackup.getCharacters().get(i).getName().equalsIgnoreCase(name)) && (UsersBackup.getCharacters().get(i).getElement().equalsIgnoreCase(elem))) {
                return (WindCharacter) UsersBackup.getCharacters().get(i);
            }
        }
        return null;
    }

    public GroundCharacter deleteGroundCharacter(String name, String elem) {
        for (int i = 0; i < UsersBackup.getCharacters().size(); i++) {
            if ((UsersBackup.getCharacters().get(i).getName().equalsIgnoreCase(name)) && (UsersBackup.getCharacters().get(i).getElement().equalsIgnoreCase(elem))) {
                return (GroundCharacter) UsersBackup.getCharacters().remove(i);
            }
        }
        return null;
    }

    public FireCharacter deleteFireCharacter(String name, String elem) {
        for (int i = 0; i < UsersBackup.getCharacters().size(); i++) {
            if ((UsersBackup.getCharacters().get(i).getName().equalsIgnoreCase(name)) && (UsersBackup.getCharacters().get(i).getElement().equalsIgnoreCase(elem))) {
                return (FireCharacter) UsersBackup.getCharacters().remove(i);
            }
        }
        return null;
    }

    public WaterCharacter deleteWaterCharacter(String name, String elem) {
        for (int i = 0; i < UsersBackup.getCharacters().size(); i++) {
            if ((UsersBackup.getCharacters().get(i).getName().equalsIgnoreCase(name)) && (UsersBackup.getCharacters().get(i).getElement().equalsIgnoreCase(elem))) {
                return (WaterCharacter) UsersBackup.getCharacters().remove(i);
            }
        }
        return null;
    }

    public WindCharacter deleteWindCharacter(String name, String elem) {
        for (int i = 0; i < UsersBackup.getCharacters().size(); i++) {
            if ((UsersBackup.getCharacters().get(i).getName().equalsIgnoreCase(name)) && (UsersBackup.getCharacters().get(i).getElement().equalsIgnoreCase(elem))) {
                return (WindCharacter) UsersBackup.getCharacters().remove(i);
            }
        }
        return null;
    }

    public void LoadComboBox() {
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        for (int i = 0; i < UserLogin.UsersBackup.getCharacters().size(); i++) {
            String Character = UserLogin.UsersBackup.getCharacters().get(i).getName();
            jComboBox1.addItem(Character);
            jComboBox2.addItem(Character);

        }
    }

    public FireCharacter ReturnChacarterFire(String Name) {
        String Element = "fire";
        for (int i = 0; i < UserLogin.UsersBackup.getCharacters().size(); i++) {
            if (UserLogin.UsersBackup.getCharacters().get(i).getName().equals(Name) && UserLogin.UsersBackup.getCharacters().get(i).getElement().equals(Element)) {
                return (FireCharacter) UserLogin.UsersBackup.getCharacters().get(i);
            }
        }
        return null;
    }

    public GroundCharacter ReturnChacarterGround(String Name) {
        String Element = "ground";
        for (int i = 0; i < UserLogin.UsersBackup.getCharacters().size(); i++) {
            if (UserLogin.UsersBackup.getCharacters().get(i).getName().equals(Name) && UserLogin.UsersBackup.getCharacters().get(i).getElement().equals(Element)) {
                return (GroundCharacter) UserLogin.UsersBackup.getCharacters().get(i);
            }
        }
        return null;
    }

    public WaterCharacter ReturnChacarterWater(String Name) {
        String Element = "water";
        for (int i = 0; i < UserLogin.UsersBackup.getCharacters().size(); i++) {
            if (UserLogin.UsersBackup.getCharacters().get(i).getName().equals(Name) && UserLogin.UsersBackup.getCharacters().get(i).getElement().equals(Element)) {
                return (WaterCharacter) UserLogin.UsersBackup.getCharacters().get(i);
            }
        }
        return null;
    }

    public WindCharacter ReturnChacarterWind(String Name) {
        String Element = "wind";
        for (int i = 0; i < UserLogin.UsersBackup.getCharacters().size(); i++) {
            if (UserLogin.UsersBackup.getCharacters().get(i).getName().equals(Name) && UserLogin.UsersBackup.getCharacters().get(i).getElement().equals(Element)) {
                return (WindCharacter) UserLogin.UsersBackup.getCharacters().get(i);
            }
        }
        return null;
    }

    public void MoveCharacterFire(FireCharacter fire, int PosX2, int PosY2) {
        DefaultTableModel model = (DefaultTableModel) jTablePlay.getModel();

        if (Turn1 == true) {
            if (PosX == PosX2) {
                if (PosY <= PosY2) {
                    int PosAuxY = PosY2 - PosY;
                    if (PosAuxY <= 3) {
                        if (matriz[PosX2][PosY2] == null) {
                            //remove character
                            model.setValueAt(null, PosX, PosY);
                            matriz[PosX][PosY] = null;

                            //Add character
                            matriz[PosX2][PosY2] = fire;
                            model.setValueAt("F", PosX2, PosY2);

                            fire.setTurn(false);

                            PosX = -1;
                            PosY = -1;

                            //////////////////////////
                            if (Cont == 0) {
                                jLabelPlayer.setText("Player2");
                                Turn1 = false;
                                Turn2 = true;
                                Cont = 3;
                                UserLogin.Methods.BackToLife1();
                                AddMana2();
                                UserLogin.Methods.ResetTurnsPlayer2();
                            } else {
                                Cont = Cont - 1;
                                if (Cont == 0) {
                                    jLabelPlayer.setText("Player2");
                                    Turn1 = false;
                                    Turn2 = true;
                                    Cont = 3;
                                    UserLogin.Methods.BackToLife1();
                                    AddMana2();
                                    UserLogin.Methods.ResetTurnsPlayer2();
                                }
                            }
                            ////////////////////////////
                        } else {
                            JOptionPane.showMessageDialog(null, "You can't add, ther is something");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "You can't move more than 3 spaces");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You can't go back");
                }
            } else if (PosY == PosY2) {
                int PosAuxX = PosX - PosX2;
                if (PosAuxX <= 3) {
                    if (matriz[PosX2][PosY2] == null) {
                        //remove character
                        model.setValueAt(null, PosX, PosY);
                        matriz[PosX][PosY] = null;

                        //Add character
                        matriz[PosX2][PosY2] = fire;
                        model.setValueAt("F", PosX2, PosY2);

                        fire.setTurn(false);

                        PosX = -1;
                        PosY = -1;
                        //////////////////////////
                        if (Cont == 0) {
                            jLabelPlayer.setText("Player2");
                            Turn1 = false;
                            Turn2 = true;
                            Cont = 3;
                            UserLogin.Methods.BackToLife1();
                            AddMana2();
                            UserLogin.Methods.ResetTurnsPlayer2();
                        } else {
                            Cont = Cont - 1;
                            if (Cont == 0) {
                                jLabelPlayer.setText("Player2");
                                Turn1 = false;
                                Turn2 = true;
                                Cont = 3;
                                UserLogin.Methods.BackToLife1();
                                AddMana2();
                                UserLogin.Methods.ResetTurnsPlayer2();
                            }
                        }
                        ////////////////////////////
                    } else {
                        JOptionPane.showMessageDialog(null, "You can't add, ther is something");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You can't move more than 3 spaces");
                }
            }
        }
        if (Turn2 == true) {
            if (PosX == PosX2) {
                if (PosY >= PosY2) {
                    int PosAuxY = PosY - PosY2;
                    if (PosAuxY <= 3) {
                        if (matriz[PosX2][PosY2] == null) {
                            //remove character
                            model.setValueAt(null, PosX, PosY);
                            matriz[PosX][PosY] = null;

                            //Add character
                            matriz[PosX2][PosY2] = fire;
                            model.setValueAt("F", PosX2, PosY2);

                            fire.setTurn(false);

                            PosX = -1;
                            PosY = -1;
                            //////////////////////////
                            if (Cont == 0) {
                                jLabelPlayer.setText("Player1");
                                Turn1 = true;
                                Turn2 = false;
                                Cont = 3;
                                UserLogin.Methods.BackToLife2();
                                AddMana1();
                                UserLogin.Methods.ResetTurnsPlayer1();
                            } else {
                                Cont = Cont - 1;
                                if (Cont == 0) {
                                    jLabelPlayer.setText("Player1");
                                    Turn1 = true;
                                    Turn2 = false;
                                    Cont = 3;
                                    UserLogin.Methods.BackToLife2();
                                    AddMana1();
                                    UserLogin.Methods.ResetTurnsPlayer1();
                                }
                            }
                            ////////////////////////////
                        } else {
                            JOptionPane.showMessageDialog(null, "You can't add, ther is something");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "You can't move more than 3 spaces");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You can't go back");
                }
            } else if (PosY == PosY2) {
                int PosAuxX = PosX2 - PosX;
                if (PosAuxX <= 3) {
                    if (matriz[PosX2][PosY2] == null) {
                        //remove character
                        model.setValueAt(null, PosX, PosY);
                        matriz[PosX][PosY] = null;

                        //Add character
                        matriz[PosX2][PosY2] = fire;
                        model.setValueAt("F", PosX2, PosY2);

                        fire.setTurn(false);

                        PosX = -1;
                        PosY = -1;

                        //////////////////////////
                        if (Cont == 0) {
                            jLabelPlayer.setText("Player1");
                            Turn1 = true;
                            Turn2 = false;
                            Cont = 3;
                            UserLogin.Methods.BackToLife2();
                            AddMana1();
                            UserLogin.Methods.ResetTurnsPlayer1();
                        } else {
                            Cont = Cont - 1;
                            if (Cont == 0) {
                                jLabelPlayer.setText("Player1");
                                Turn1 = true;
                                Turn2 = false;
                                Cont = 3;
                                UserLogin.Methods.BackToLife2();
                                AddMana1();
                                UserLogin.Methods.ResetTurnsPlayer1();
                            }
                        }
                        ////////////////////////////
                    } else {
                        JOptionPane.showMessageDialog(null, "You can't add, ther is something");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You can't move more than 3 spaces");
                }

            }
        }

    }

    public void MoveCharacterWater(WaterCharacter water, int PosX2, int PosY2) {
        DefaultTableModel model = (DefaultTableModel) jTablePlay.getModel();

        if (Turn1 == true) {
            if (PosX == PosX2) {
                if (PosY <= PosY2) {
                    int PosAuxY = PosY2 - PosY;
                    if (PosAuxY <= 3) {
                        if (matriz[PosX2][PosY2] == null) {
                            //remove character
                            model.setValueAt(null, PosX, PosY);
                            matriz[PosX][PosY] = null;

                            //Add character
                            matriz[PosX2][PosY2] = water;
                            model.setValueAt("W", PosX2, PosY2);

                            water.setTurn(false);

                            PosX = -1;
                            PosY = -1;

                            //////////////////////////
                            if (Cont == 0) {
                                jLabelPlayer.setText("Player2");
                                Turn1 = false;
                                Turn2 = true;
                                Cont = 3;
                                BackToLife1();
                                AddMana2();
                                UserLogin.Methods.ResetTurnsPlayer2();
                            } else {
                                Cont = Cont - 1;
                                if (Cont == 0) {
                                    jLabelPlayer.setText("Player2");
                                    Turn1 = false;
                                    Turn2 = true;
                                    Cont = 3;
                                    BackToLife1();
                                    AddMana2();
                                    UserLogin.Methods.ResetTurnsPlayer2();
                                }
                            }
                            ////////////////////////////
                        } else {
                            JOptionPane.showMessageDialog(null, "You can't add, ther is something");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "You can't move more than 3 spaces");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You can't go back");
                }
            } else if (PosY == PosY2) {
                int PosAuxX = PosX - PosX2;
                if (PosAuxX <= 3) {
                    if (matriz[PosX2][PosY2] == null) {
                        //remove character
                        model.setValueAt(null, PosX, PosY);
                        matriz[PosX][PosY] = null;

                        //Add character
                        matriz[PosX2][PosY2] = water;
                        model.setValueAt("W", PosX2, PosY2);

                        water.setTurn(false);

                        PosX = -1;
                        PosY = -1;

                        //////////////////////////
                        if (Cont == 0) {
                            jLabelPlayer.setText("Player2");
                            Turn1 = false;
                            Turn2 = true;
                            Cont = 3;
                            BackToLife1();
                            AddMana2();
                            UserLogin.Methods.ResetTurnsPlayer2();
                        } else {
                            Cont = Cont - 1;
                            if (Cont == 0) {
                                jLabelPlayer.setText("Player2");
                                Turn1 = false;
                                Turn2 = true;
                                Cont = 3;
                                BackToLife1();
                                AddMana2();
                                UserLogin.Methods.ResetTurnsPlayer2();
                            }
                        }
                        ////////////////////////////
                    } else {
                        JOptionPane.showMessageDialog(null, "You can't add, ther is something");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You can't move more than 3 spaces");
                }

            }
        }
        if (Turn2 == true) {
            if (PosX == PosX2) {
                if (PosY >= PosY2) {
                    int PosAuxY = PosY - PosY2;
                    if (PosAuxY <= 3) {
                        if (matriz[PosX2][PosY2] == null) {
                            //remove character
                            model.setValueAt(null, PosX, PosY);
                            matriz[PosX][PosY] = null;

                            //Add character
                            matriz[PosX2][PosY2] = water;
                            model.setValueAt("W", PosX2, PosY2);

                            water.setTurn(false);

                            PosX = -1;
                            PosY = -1;

                            //////////////////////////
                            if (Cont == 0) {
                                jLabelPlayer.setText("Player1");
                                Turn1 = true;
                                Turn2 = false;
                                Cont = 3;
                                BackToLife2();
                                AddMana1();
                                UserLogin.Methods.ResetTurnsPlayer1();
                            } else {
                                Cont = Cont - 1;
                                if (Cont == 0) {
                                    jLabelPlayer.setText("Player1");
                                    Turn1 = true;
                                    Turn2 = false;
                                    Cont = 3;
                                    BackToLife2();
                                    AddMana1();
                                    UserLogin.Methods.ResetTurnsPlayer1();
                                }
                            }
                            ////////////////////////////
                        } else {
                            JOptionPane.showMessageDialog(null, "You can't add, ther is something");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "You can't move more than 3 spaces");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You can't go back");
                }
            } else if (PosY == PosY2) {
                int PosAuxX = PosX2 - PosX;
                if (PosAuxX <= 3) {
                    if (matriz[PosX2][PosY2] == null) {
                        //remove character
                        model.setValueAt(null, PosX, PosY);
                        matriz[PosX][PosY] = null;

                        //Add character
                        matriz[PosX2][PosY2] = water;
                        model.setValueAt("W", PosX2, PosY2);

                        water.setTurn(false);

                        PosX = -1;
                        PosY = -1;

                        //////////////////////////
                        if (Cont == 0) {
                            jLabelPlayer.setText("Player1");
                            Turn1 = true;
                            Turn2 = false;
                            Cont = 3;
                            BackToLife2();
                            AddMana1();
                            UserLogin.Methods.ResetTurnsPlayer1();
                        } else {
                            Cont = Cont - 1;
                            if (Cont == 0) {
                                jLabelPlayer.setText("Player1");
                                Turn1 = true;
                                Turn2 = false;
                                Cont = 3;
                                BackToLife2();
                                AddMana1();
                                UserLogin.Methods.ResetTurnsPlayer1();
                            }
                        }
                        ////////////////////////////
                    } else {
                        JOptionPane.showMessageDialog(null, "You can't add, ther is something");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You can't move more than 3 spaces");
                }

            }
        }

    }

    public void MoveCharacterWind(WindCharacter wind, int PosX2, int PosY2) {
        DefaultTableModel model = (DefaultTableModel) jTablePlay.getModel();

        if (Turn1 == true) {
            if (PosX == PosX2) {
                if (PosY <= PosY2) {
                    int PosAuxY = PosY2 - PosY;
                    if (PosAuxY <= 3) {
                        if (matriz[PosX2][PosY2] == null) {
                            //remove character
                            model.setValueAt(null, PosX, PosY);
                            matriz[PosX][PosY] = null;

                            //Add character
                            matriz[PosX2][PosY2] = wind;
                            model.setValueAt("C", PosX2, PosY2);

                            wind.setTurn(false);

                            PosX = -1;
                            PosY = -1;

                            //////////////////////////
                            if (Cont == 0) {
                                jLabelPlayer.setText("Player2");
                                Turn1 = false;
                                Turn2 = true;
                                Cont = 3;
                                BackToLife1();
                                AddMana2();
                                UserLogin.Methods.ResetTurnsPlayer2();
                            } else {
                                Cont = Cont - 1;
                                if (Cont == 0) {
                                    jLabelPlayer.setText("Player2");
                                    Turn1 = false;
                                    Turn2 = true;
                                    Cont = 3;
                                    BackToLife1();
                                    AddMana2();
                                    UserLogin.Methods.ResetTurnsPlayer2();
                                }
                            }
                            ////////////////////////////
                        } else {
                            JOptionPane.showMessageDialog(null, "You can't add, ther is something");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "You can't move more than 3 spaces");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You can't go back");
                }
            } else if (PosY == PosY2) {
                int PosAuxX = PosX - PosX2;
                if (PosAuxX <= 3) {
                    if (matriz[PosX2][PosY2] == null) {
                        //remove character
                        model.setValueAt(null, PosX, PosY);
                        matriz[PosX][PosY] = null;

                        //Add character
                        matriz[PosX2][PosY2] = wind;
                        model.setValueAt("C", PosX2, PosY2);

                        wind.setTurn(false);

                        PosX = -1;
                        PosY = -1;

                        //////////////////////////
                        if (Cont == 0) {
                            jLabelPlayer.setText("Player2");
                            Turn1 = false;
                            Turn2 = true;
                            Cont = 3;
                            BackToLife1();
                            AddMana2();
                            UserLogin.Methods.ResetTurnsPlayer2();
                        } else {
                            Cont = Cont - 1;
                            if (Cont == 0) {
                                jLabelPlayer.setText("Player2");
                                Turn1 = false;
                                Turn2 = true;
                                Cont = 3;
                                BackToLife1();
                                AddMana2();
                                UserLogin.Methods.ResetTurnsPlayer2();
                            }
                        }
                        ////////////////////////////
                    } else {
                        JOptionPane.showMessageDialog(null, "You can't add, ther is something");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You can't move more than 3 spaces");
                }

            }
        }
        if (Turn2 == true) {
            if (PosX == PosX2) {
                if (PosY >= PosY2) {
                    int PosAuxY = PosY - PosY2;
                    if (PosAuxY <= 3) {
                        if (matriz[PosX2][PosY2] == null) {
                            //remove character
                            model.setValueAt(null, PosX, PosY);
                            matriz[PosX][PosY] = null;

                            //Add character
                            matriz[PosX2][PosY2] = wind;
                            model.setValueAt("C", PosX2, PosY2);

                            wind.setTurn(false);

                            PosX = -1;
                            PosY = -1;

                            //////////////////////////
                            if (Cont == 0) {
                                jLabelPlayer.setText("Player1");
                                Turn1 = true;
                                Turn2 = false;
                                BackToLife2();
                                AddMana1();
                                Cont = 3;
                                UserLogin.Methods.ResetTurnsPlayer1();
                            } else {
                                Cont = Cont - 1;
                                if (Cont == 0) {
                                    jLabelPlayer.setText("Player1");
                                    Turn1 = true;
                                    Turn2 = false;
                                    Cont = 3;
                                    BackToLife2();
                                    AddMana1();
                                    UserLogin.Methods.ResetTurnsPlayer1();
                                }
                            }
                            ////////////////////////////
                        } else {
                            JOptionPane.showMessageDialog(null, "You can't add, ther is something");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "You can't move more than 3 spaces");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You can't go back");
                }
            } else if (PosY == PosY2) {
                int PosAuxX = PosX2 - PosX;
                if (PosAuxX <= 3) {
                    if (matriz[PosX2][PosY2] == null) {
                        //remove character
                        model.setValueAt(null, PosX, PosY);
                        matriz[PosX][PosY] = null;

                        //Add character
                        matriz[PosX2][PosY2] = wind;
                        model.setValueAt("C", PosX2, PosY2);

                        wind.setTurn(false);

                        PosX = -1;
                        PosY = -1;

                        //////////////////////////
                        if (Cont == 0) {
                            jLabelPlayer.setText("Player1");
                            Turn1 = true;
                            Turn2 = false;
                            Cont = 3;
                            BackToLife2();
                            AddMana1();
                            UserLogin.Methods.ResetTurnsPlayer1();
                        } else {
                            Cont = Cont - 1;
                            if (Cont == 0) {
                                jLabelPlayer.setText("Player1");
                                Turn1 = true;
                                Turn2 = false;
                                Cont = 3;
                                BackToLife2();
                                AddMana1();
                                UserLogin.Methods.ResetTurnsPlayer1();
                            }
                        }
                        ////////////////////////////
                    } else {
                        JOptionPane.showMessageDialog(null, "You can't add, ther is something");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You can't move more than 3 spaces");
                }

            }
        }

    }

    public void MoveCharacterGround(GroundCharacter ground, int PosX2, int PosY2) {
        DefaultTableModel model = (DefaultTableModel) jTablePlay.getModel();

        if (Turn1 == true) {
            if (PosX == PosX2) {
                if (PosY <= PosY2) {
                    int PosAuxY = PosY2 - PosY;
                    if (PosAuxY <= 3) {
                        if (matriz[PosX2][PosY2] == null) {
                            //remove character
                            model.setValueAt(null, PosX, PosY);
                            matriz[PosX][PosY] = null;

                            //Add character
                            matriz[PosX2][PosY2] = ground;
                            model.setValueAt("G", PosX2, PosY2);

                            ground.setTurn(false);

                            PosX = -1;
                            PosY = -1;

                            //////////////////////////
                            if (Cont == 0) {
                                jLabelPlayer.setText("Player2");
                                Turn1 = false;
                                Turn2 = true;
                                Cont = 3;
                                BackToLife1();
                                AddMana2();
                                UserLogin.Methods.ResetTurnsPlayer2();
                            } else {
                                Cont = Cont - 1;
                                if (Cont == 0) {
                                    jLabelPlayer.setText("Player2");
                                    Turn1 = false;
                                    Turn2 = true;
                                    Cont = 3;
                                    BackToLife1();
                                    AddMana2();
                                    UserLogin.Methods.ResetTurnsPlayer2();
                                }
                            }
                            ////////////////////////////
                        } else {
                            JOptionPane.showMessageDialog(null, "You can't add, ther is something");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "You can't move more than 3 spaces");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You can't go back");
                }
            } else if (PosY == PosY2) {
                int PosAuxX = PosX - PosX2;
                if (PosAuxX <= 3) {
                    if (matriz[PosX2][PosY2] == null) {
                        //remove character
                        model.setValueAt(null, PosX, PosY);
                        matriz[PosX][PosY] = null;

                        //Add character
                        matriz[PosX2][PosY2] = ground;
                        model.setValueAt("G", PosX2, PosY2);

                        ground.setTurn(false);

                        PosX = -1;
                        PosY = -1;

                        //////////////////////////
                        if (Cont == 0) {
                            jLabelPlayer.setText("Player2");
                            Turn1 = false;
                            Turn2 = true;
                            Cont = 3;
                            BackToLife1();
                            AddMana2();
                            UserLogin.Methods.ResetTurnsPlayer2();
                        } else {
                            Cont = Cont - 1;
                            if (Cont == 0) {
                                jLabelPlayer.setText("Player2");
                                Turn1 = false;
                                Turn2 = true;
                                Cont = 3;
                                BackToLife1();
                                AddMana2();
                                UserLogin.Methods.ResetTurnsPlayer2();
                            }
                        }
                        ////////////////////////////
                    } else {
                        JOptionPane.showMessageDialog(null, "You can't add, ther is something");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You can't move more than 3 spaces");
                }

            }
        }
        if (Turn2 == true) {
            if (PosX == PosX2) {
                if (PosY >= PosY2) {
                    int PosAuxY = PosY - PosY2;
                    if (PosAuxY <= 3) {
                        if (matriz[PosX2][PosY2] == null) {
                            //remove character
                            model.setValueAt(null, PosX, PosY);
                            matriz[PosX][PosY] = null;

                            //Add character
                            matriz[PosX2][PosY2] = ground;
                            model.setValueAt("G", PosX2, PosY2);

                            ground.setTurn(false);

                            PosX = -1;
                            PosY = -1;

                            //////////////////////////
                            if (Cont == 0) {
                                jLabelPlayer.setText("Player1");
                                Turn1 = true;
                                Turn2 = false;
                                Cont = 3;
                                BackToLife2();
                                AddMana1();
                                UserLogin.Methods.ResetTurnsPlayer1();
                            } else {
                                Cont = Cont - 1;
                                if (Cont == 0) {
                                    jLabelPlayer.setText("Player1");
                                    Turn1 = true;
                                    Turn2 = false;
                                    Cont = 3;
                                    BackToLife2();
                                    AddMana1();
                                    UserLogin.Methods.ResetTurnsPlayer1();
                                }
                            }
                            ////////////////////////////
                        } else {
                            JOptionPane.showMessageDialog(null, "You can't add, ther is something");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "You can't move more than 3 spaces");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You can't go back");
                }
            } else if (PosY == PosY2) {
                int PosAuxX = PosX2 - PosX;
                if (PosAuxX <= 3) {
                    if (matriz[PosX2][PosY2] == null) {
                        //remove character
                        model.setValueAt(null, PosX, PosY);
                        matriz[PosX][PosY] = null;

                        //Add character
                        matriz[PosX2][PosY2] = ground;
                        model.setValueAt("G", PosX2, PosY2);

                        ground.setTurn(false);

                        PosX = -1;
                        PosY = -1;

                        //////////////////////////
                        if (Cont == 0) {
                            jLabelPlayer.setText("Player1");
                            Turn1 = true;
                            Turn2 = false;
                            Cont = 3;
                            BackToLife2();
                            AddMana1();
                            UserLogin.Methods.ResetTurnsPlayer1();
                        } else {
                            Cont = Cont - 1;
                            if (Cont == 0) {
                                jLabelPlayer.setText("Player1");
                                Turn1 = true;
                                Turn2 = false;
                                Cont = 3;
                                BackToLife2();
                                AddMana1();
                                UserLogin.Methods.ResetTurnsPlayer1();
                            }
                        }
                        ////////////////////////////
                    } else {
                        JOptionPane.showMessageDialog(null, "You can't add, ther is something");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You can't move more than 3 spaces");
                }

            }
        }
    }

    public void ResetTurnsPlayer1() {
        for (int i = 0; i < player1.fireCharactersList.size(); i++) {
            player1.fireCharactersList.get(i).setTurn(true);
        }
        for (int i = 0; i < player1.groundCharactersList.size(); i++) {
            player1.groundCharactersList.get(i).setTurn(true);
        }
        for (int i = 0; i < player1.waterCharactersList.size(); i++) {
            player1.waterCharactersList.get(i).setTurn(true);
        }
        for (int i = 0; i < player1.windCharactersList.size(); i++) {
            player1.windCharactersList.get(i).setTurn(true);
        }
    }

    public void ResetTurnsPlayer2() {
        for (int i = 0; i < player2.fireCharactersList.size(); i++) {
            player2.fireCharactersList.get(i).setTurn(true);
        }
        for (int i = 0; i < player2.groundCharactersList.size(); i++) {
            player2.groundCharactersList.get(i).setTurn(true);
        }
        for (int i = 0; i < player2.waterCharactersList.size(); i++) {
            player2.waterCharactersList.get(i).setTurn(true);
        }
        for (int i = 0; i < player2.windCharactersList.size(); i++) {
            player2.windCharactersList.get(i).setTurn(true);
        }
    }

    public void LoadAbilitiesFire(FireCharacter fireCharacter) {
        jComboBoxAbilities.removeAllItems();
        for (int i = 0; i < fireCharacter.getFireAbilities().size(); i++) {
            String Abilities = fireCharacter.getFireAbilities().get(i).getName();
            jComboBoxAbilities.addItem(Abilities);
        }
    }

    public void LoadAbilitiesWater(WaterCharacter waterCharacter) {
        jComboBoxAbilities.removeAllItems();
        for (int i = 0; i < waterCharacter.getWaterAbilities().size(); i++) {
            String Abilities = waterCharacter.getWaterAbilities().get(i).getName();
            jComboBoxAbilities.addItem(Abilities);
        }
    }

    public void LoadAbilitiesWind(WindCharacter windCharacter) {
        jComboBoxAbilities.removeAllItems();
        for (int i = 0; i < windCharacter.getWindAbilities().size(); i++) {
            String Abilities = windCharacter.getWindAbilities().get(i).getName();
            jComboBoxAbilities.addItem(Abilities);
        }
    }

    public void LoadAbilitiesGround(GroundCharacter groundCharacter) {
        jComboBoxAbilities.removeAllItems();
        for (int i = 0; i < groundCharacter.getGroundAbilities().size(); i++) {
            String Abilities = groundCharacter.getGroundAbilities().get(i).getName();
            jComboBoxAbilities.addItem(Abilities);
        }
    }

    public void clearAll() {
        Cont = 3;
        Turn1 = true;
        Turn2 = false;
        jLabelPlayer.setText("Player1");
        ResetTurnsPlayer1();
        ResetTurnsPlayer2();
        for (int i = jTableCharacters.getRowCount() - 1; i >= 0; i--) {
            for (int j = jTableCharacters.getRowCount() - 1; j >= 0; j--) {
                jTableCharacters.setValueAt(null, i, j);
            }
        }
        for (int i = jTable2.getRowCount() - 1; i >= 0; i--) {
            for (int j = jTable2.getRowCount() - 1; j >= 0; j--) {
                jTable2.setValueAt(null, i, j);
            }
        }
        for (int i = jTablePlay.getRowCount() - 1; i >= 0; i--) {
            for (int j = jTablePlay.getRowCount() - 1; j >= 0; j--) {
                jTablePlay.setValueAt(null, i, j);
            }
        }
    }

    public void BackToLife1() {
        for (int i = jTablePlay.getRowCount() - 1; i >= 0; i--) {
            for (int j = jTablePlay.getRowCount() - 1; j >= 0; j--) {
                String TableObject = jTablePlay.getValueAt(i, j) + "";
                if (TableObject.equals("X")) {
                    if (player1.fireCharactersList.contains(matriz[i][j])) {
                        FireCharacter fireCharacter = (FireCharacter) matriz[i][j];
                        fireCharacter.setHealth(500);
                        jTablePlay.setValueAt("F", i, j);
                    } else if (player1.groundCharactersList.contains(matriz[i][j])) {
                        GroundCharacter groundCharacter = (GroundCharacter) matriz[i][j];
                        groundCharacter.setHealth(550);
                        jTablePlay.setValueAt("G", i, j);
                    } else if (player1.waterCharactersList.contains(matriz[i][j])) {
                        WaterCharacter waterCharacter = (WaterCharacter) matriz[i][j];
                        waterCharacter.setHealth(350);
                        jTablePlay.setValueAt("W", i, j);
                    } else if (player1.windCharactersList.contains(matriz[i][j])) {
                        WindCharacter windCharacter = (WindCharacter) matriz[i][j];
                        windCharacter.setHealth(300);
                        jTablePlay.setValueAt("C", i, j);
                    }
                }
            }
        }
    }

    public void BackToLife2() {
        for (int i = jTablePlay.getRowCount() - 1; i >= 0; i--) {
            for (int j = jTablePlay.getRowCount() - 1; j >= 0; j--) {
                String TableObject = jTablePlay.getValueAt(i, j) + "";
                if (TableObject.equals("X")) {
                    if (player2.fireCharactersList.contains(matriz[i][j])) {
                        FireCharacter fireCharacter = (FireCharacter) matriz[i][j];
                        fireCharacter.setHealth(500);
                        jTablePlay.setValueAt("F", i, j);
                    } else if (player2.groundCharactersList.contains(matriz[i][j])) {
                        GroundCharacter groundCharacter = (GroundCharacter) matriz[i][j];
                        groundCharacter.setHealth(550);
                        jTablePlay.setValueAt("G", i, j);
                    } else if (player2.waterCharactersList.contains(matriz[i][j])) {
                        WaterCharacter waterCharacter = (WaterCharacter) matriz[i][j];
                        waterCharacter.setHealth(350);
                        jTablePlay.setValueAt("W", i, j);
                    } else if (player2.windCharactersList.contains(matriz[i][j])) {
                        WindCharacter windCharacter = (WindCharacter) matriz[i][j];
                        windCharacter.setHealth(300);
                        jTablePlay.setValueAt("C", i, j);
                    }
                }
            }
        }
    }

    public void AddMana1() {
        for (int i = 0; i < player1.fireCharactersList.size(); i++) {
            if (player1.fireCharactersList.get(i).getMana() <= 300) {
                int Mana = (int) (player1.fireCharactersList.get(i).getMana() + (player1.fireCharactersList.get(i).getMana() * 0.25));
                player1.fireCharactersList.get(i).setMana(Mana);
            }
        }
        for (int i = 0; i < player1.groundCharactersList.size(); i++) {
            if (player1.groundCharactersList.get(i).getMana() <= 300) {
                int Mana = (int) (player1.groundCharactersList.get(i).getMana() + (player1.groundCharactersList.get(i).getMana() * 0.25));
                player1.groundCharactersList.get(i).setMana(Mana);
            }
        }
        for (int i = 0; i < player1.waterCharactersList.size(); i++) {
            if (player1.waterCharactersList.get(i).getMana() <= 300) {
                int Mana = (int) (player1.waterCharactersList.get(i).getMana() + (player1.waterCharactersList.get(i).getMana() * 0.25));
                player1.waterCharactersList.get(i).setMana(Mana);
            }
        }
        for (int i = 0; i < player1.windCharactersList.size(); i++) {
            if (player1.windCharactersList.get(i).getMana() <= 300) {
                int Mana = (int) (player1.windCharactersList.get(i).getMana() + (player1.windCharactersList.get(i).getMana() * 0.25));
                player1.windCharactersList.get(i).setMana(Mana);
            }
        }
    }

    public void AddMana2() {
        for (int i = 0; i < player2.fireCharactersList.size(); i++) {
            if (player2.fireCharactersList.get(i).getMana() <= 300) {
                int Mana = (int) (player2.fireCharactersList.get(i).getMana() + (player2.fireCharactersList.get(i).getMana() * 0.25));
                player2.fireCharactersList.get(i).setMana(Mana);
            }
        }
        for (int i = 0; i < player2.groundCharactersList.size(); i++) {
            if (player2.groundCharactersList.get(i).getMana() <= 300) {
                int Mana = (int) (player2.groundCharactersList.get(i).getMana() + (player2.groundCharactersList.get(i).getMana() * 0.25));
                player2.groundCharactersList.get(i).setMana(Mana);
            }
        }
        for (int i = 0; i < player2.waterCharactersList.size(); i++) {
            if (player2.waterCharactersList.get(i).getMana() <= 300) {
                int Mana = (int) (player2.waterCharactersList.get(i).getMana() + (player2.waterCharactersList.get(i).getMana() * 0.25));
                player2.waterCharactersList.get(i).setMana(Mana);
            }
        }
        for (int i = 0; i < player2.windCharactersList.size(); i++) {
            if (player2.windCharactersList.get(i).getMana() <= 300) {
                int Mana = (int) (player2.windCharactersList.get(i).getMana() + (player2.windCharactersList.get(i).getMana() * 0.25));
                player2.windCharactersList.get(i).setMana(Mana);
            }
        }
    }
}

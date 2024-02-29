package com.example.fxproject.services;



import com.example.fxproject.entities.Evenement;
import com.example.fxproject.tools.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Evenementcrud implements ICrud<Evenement> {

    Connection cnx2;

    public Evenementcrud() {
        cnx2 = MyConnection.getInstance().getCnx();
    }


    @Override
    public void ajouterEntite(Evenement e) {
        String req1 = "INSERT INTO evenements (,date_event, capacite_event, localisation, nom_club, Description, type_event, Image) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement st = cnx2.prepareStatement(req1)) {
            st.setDate(1, e.getDate_event());
            st.setInt(2, e.getCapacite_event());
            st.setString(3, e.getLocalisation());
            st.setString(4, e.getNom_club());
            st.setString(5, e.getDescription());
            st.setString(6, e.getType_event());
            st.setString(7, e.getImage_event());
            st.executeUpdate();
            System.out.println("Evenement ajouté");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<Evenement> afficherEntite() {
        List<Evenement> evenements = new ArrayList<>();
        String req3 = "SELECT * FROM evenements";
        try {
            PreparedStatement stm = cnx2.prepareStatement(req3);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Evenement evenement = new Evenement();
                evenement.setId_event(rs.getInt("id_event"));
                evenement.setDate_event(rs.getDate("date_event"));
                evenement.setCapacite_event(rs.getInt("capacite_event"));
                evenement.setLocalisation(rs.getString("localisation"));
                evenement.setNom_club(rs.getString("nom_club"));
                evenement.setDescription(rs.getString("Description"));
                evenement.setType_event(rs.getString("type_event"));
                evenement.setImage_event(rs.getString("Image"));
                evenements.add(evenement);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return evenements;
    }


    public void modifierEntite(Evenement e) {
        String qry = "UPDATE evenements SET date_event=?, capacite_event=?, localisation=?, nom_club=?, Description=?, type_event=?, Image=? WHERE id_event=?";

        try {
            PreparedStatement stm = cnx2.prepareStatement(qry);
            stm.setDate(1, e.getDate_event());
            stm.setInt(2, e.getCapacite_event());
            stm.setString(3, e.getLocalisation());
            stm.setString(4, e.getNom_club());
            stm.setString(5, e.getDescription());
            stm.setString(6, e.getType_event());
            stm.setString(7, e.getImage_event());
            stm.setInt(8, e.getId_event());
           int rows= stm.executeUpdate();
           if (rows>0) {
               System.out.println("Evenement mis à jour");
               }else {  System.out.println("Aucune modification effectuée."); }

           } catch (SQLException ex) {
            System.out.println((ex.getMessage()));
        }
    }
    public void supprimerEntite(Evenement event) {
        String requet = "DELETE FROM evenements WHERE id_event=?";
        try {
            PreparedStatement pst = cnx2.prepareStatement(requet);
            pst.setInt(1, event.getId_event());
            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Suppression réussie");
            } else {
                System.out.println("Aucune suppression effectuée. Vérifiez l'ID.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}


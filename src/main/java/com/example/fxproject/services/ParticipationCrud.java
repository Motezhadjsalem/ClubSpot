package com.example.fxproject.services;



import com.example.fxproject.entities.Participation;
import com.example.fxproject.tools.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ParticipationCrud implements ICrud<Participation> {

    private Connection cnx2;

    public ParticipationCrud() {
        cnx2 = MyConnection.getInstance().getCnx();
    }

    @Override
    public void ajouterEntite(Participation p) {
        String req = "INSERT INTO participations ( nom_par, prenom_par, age_par,id_event, id_user) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement st = cnx2.prepareStatement(req)) {
              st.setString(1,p.getNom_par());
            st.setString(2,p.getPrenom_par());
            st.setString(3,p.getAge_par());
            st.setString(3,p.getAge_par());
            st.setInt(4, p.getId_event());
            st.setInt(5, p.getId_user());
            st.executeUpdate();
            System.out.println("Participation ajoutée");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<Participation> afficherEntite() {
        List<Participation> participations = new ArrayList<>();
        String req = "SELECT * FROM participations";
        try (PreparedStatement stm = cnx2.prepareStatement(req); ResultSet rs = stm.executeQuery()) {
            while (rs.next()) {
                Participation p = new Participation();
                p.setId_par(rs.getInt("id_par"));
                p.setNom_par(rs.getString("nom_par"));
                p.setPrenom_par(rs.getString("prenom_par"));
                p.setAge_par(rs.getString("age_par"));
                p.setId_event(rs.getInt("id_event"));
                p.setId_user(rs.getInt("id_user"));
                participations.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return participations;
    }

    @Override



    public void modifierEntite(Participation p) {
        String qry = "UPDATE participation SET =? , id_par=?, nom_par=?, prenom_par=?, age_par=?, id_event=?, id_user WHERE id_par=?";

        try {
            PreparedStatement stm = cnx2.prepareStatement(qry);
            stm.setString(1, p.getNom_par());
            stm.setString(2, p.getPrenom_par());
            stm.setString(3, p.getAge_par());
            stm.setInt(4, p.getId_event());
            stm.setInt(5, p.getId_user());
            int rows= stm.executeUpdate();
            if (rows>0) {
                System.out.println("Evenement mis à jour");
            }else {  System.out.println("Aucune modification effectuée."); }

        } catch (SQLException ex) {
            System.out.println((ex.getMessage()));
        }}

    public void supprimerEntite(Participation p) {
        String requet = "DELETE FROM evenements WHERE id_par=?";
        try {
            PreparedStatement pst = cnx2.prepareStatement(requet);
            pst.setInt(1, p.getId_par());
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








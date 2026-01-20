# Système de Gestion des Étudiants (L3 Informatique)
![Texte alternatif](asset)
Ce projet est une application desktop développée en **Java** permettant la gestion administrative des étudiants.

## 🚀 Technologies utilisées
- **IDE** : NetBeans
- **Base de données** : MySQL
- **Interface** : Java Swing (JFrame)

## 🛠️ Bibliothèques (Libraries) incluses
Le projet utilise les dépendances suivantes :
- `mysql-connector-java` : Pilote de connexion à la base de données.
- `rs2xml` : Affichage automatique des requêtes SQL dans les tableaux.
- `jcalendar` : Sélecteur de date graphique.
- `JTattoo` : Thèmes pour l'interface utilisateur.

## 📂 Structure
- `IHM` : Contient l'interface graphique `IHM_Etudiant.java`.
- `JavaConnectDB.java` : Gère la connexion JDBC à MySQL.

## ⚙️ Installation
1. Importer le fichier `.sql` dans votre serveur MySQL local.
2. Configurer les identifiants dans `JavaConnectDB.java`.
3. Ajouter les fichiers `.jar` du dossier `Libraries` au projet NetBeans.



Ont utilise : Class.forName("com.mysql.jdbc.Driver"); // pourtant ce Obsolète depuis MySQL Connector/J 8.
 
class forme a utilise : Class.forName("com.mysql.cj.jdbc.Driver");


Pour modifier directement un table en clickan deux fois sur le table concerner : private void TableTitleMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        int row = TableTitle.getSelectedRow();

    if (row >= 0) {
        txtmat.setText(TableTitle.getValueAt(row, 0).toString());
        txtnom.setText(TableTitle.getValueAt(row, 1).toString());
        txtprenom.setText(TableTitle.getValueAt(row, 2).toString());
        Cmbsexe.setSelectedItem(TableTitle.getValueAt(row, 3).toString());
        Cmbniveau.setSelectedItem(TableTitle.getValueAt(row, 4).toString());
        Cmbdomain.setSelectedItem(TableTitle.getValueAt(row, 5).toString());

        try {
            java.util.Date date = new SimpleDateFormat("yyyy-MM-dd")
                    .parse(TableTitle.getValueAt(row, 6).toString());
            Datejour.setDate(date);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur date : " + e.getMessage());
        }
    }
    }        
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ideal
 */
public class User {
    private int Id;
    private String Prenom ;
    private String Nom ;
    private String Login ;
    private String Password ;
    private String Profile ;
    
    //constructeur sans argument
    public User (){
        
    }
    //constructeur avec argument 
    public User (int Id,String Prenom ,String Nom ,String Login ,String Password, String Profile ){
        this.Id=Id;
        this.Prenom=Prenom;
        this.Nom=Nom;
        this.Login=Login;
        this.Password=Password;
        this.Profile=Profile;
    }
    //methode getter 
    public int getId(){
        return Id;
    }
    public String getPrenom(){
        return Prenom;
    }
    public String getNom(){
        return Nom;
    }
    public String getLogin(){
        return Login;
    }
    public String getPassword(){
        return Password;
    }
    public String getprofile(){
        return Profile;
    }
    
    //methode setter
    public void SetId(int Id){
        this.Id=Id;
    }
    public void SetPrenom(String Prenom){
        this.Prenom=Prenom;
    }
    public void SetNom(String Nom){
        this.Nom=Nom;
    }
    public void SetLogin(String Login){
        this.Login=Login;
    }
    public void SetPassword(String Password){
        this.Password=Password;
    }public void SetProfile(String Profile){
        this.Profile=Profile;
    }
}

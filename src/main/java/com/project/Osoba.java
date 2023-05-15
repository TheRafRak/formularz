package com.project;

    public class Osoba {
        private String imie;
        private String nazwisko;
        private String telefon;
        private String mail;


        public Osoba(String imie, String nazwisko, String telefon, String mail) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.telefon = telefon;
            this.mail = mail;
        }



        public String getImie() {
            return imie;
        }

        public void setImie(String imie) {
            this.imie = imie;
        }

        public String getNazwisko() {
            return nazwisko;
        }

        public void setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
        }

        public String getTelefon() {
            return telefon;
        }

        public void setTelefon(String telefon) {
            this.telefon = telefon;
        }

        public String getMail() {
            return mail;
        }

        public void setMail(String mail) {
            this.mail = mail;
        }
    }



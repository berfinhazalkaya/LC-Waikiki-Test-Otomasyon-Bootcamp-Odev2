Feature: Cart Page


    Scenario: Sepete Urun Ekleme
    Given Uygulama acilir
    When  Arama cubuguna "Kadın Elbise" yazilir
    When  Ara butonuna tiklanir
    When  4.siradaki elbiseye tiklanir
    When  Elbise bedeni olarak 34 secilir
    When  Sepete ekleye tiklanir
    When  Sepete gidilir
    When Odeme adimina gecilir
    When Uye olmadan devam etmek icin mail adresi kismina "berfinkaya123@gmail.com" yazilir
    When Kullanim sozlesmesini onayla
    When Uye olmadan devam et butonuna tıkla
    Then  Odeme sayfasinin geldigi kontrol edilir
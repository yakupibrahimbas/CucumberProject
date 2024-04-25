
@US004PR
Feature: GetLand Test
    Scenario: Kullanıcı Admin rolünde sayfayı İngilzce görüntüleyebilmelidir.
    Given Kullanici "http://www.getlandestate.com/" sites gider
    When sayfada login kismina tiklanir
    Then Admin E-Postası girilir
    But Admin Şifre girilir ve sayfaya giriş yapılır
    But Sayfa üst kısmında yer alan ingilizce butonuna tıklanır



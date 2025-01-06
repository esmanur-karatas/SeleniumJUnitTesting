# AssertionClass - JUnit ile Test Doğrulama

Bu proje, **JUnit** kullanarak **Selenium WebDriver** ile yapılan bir testin doğrulama (assertion) işlemlerini içermektedir. Test, **Amazon** sitesinde "Nutella" araması yaparak arama sonucunun beklenen değeri içerip içermediğini doğrulamaktadır. Bu proje, testlerde doğru sonuçlar almayı sağlamak için **Assertion** (doğrulama) yapılarının nasıl kullanılacağını göstermektedir.

## 🛠️ Kullanılan Araçlar ve Teknolojiler

- **Selenium WebDriver**: Web tarayıcı etkileşimini otomatikleştirmek için kullanılır.
- **JUnit**: Testlerin yazılması ve çalıştırılması için kullanılan Java tabanlı bir test framework'üdür.
- **WebDriverManager**: Tarayıcı sürücülerini otomatik olarak yönetir.

## 📋 Testin İçeriği

### Test Senaryosu: Amazon Arama Sonucu Doğrulama

1. **Test Başlatılması**: Amazon Türkiye sitesine gidilir.
2. **Arama İşlemi**: Arama kutusuna "Nutella" yazılır ve Enter tuşuna basılarak arama başlatılır.
3. **Sonuçların Doğrulanması**: Arama sonuçlarından alınan metin ile "Nutella" kelimesinin bulunduğu doğrulanır.
4. **Assertion Kullanımı**: JUnit'in `Assert.assertTrue()` metodu ile arama sonuçlarının içinde "Nutella" kelimesi olup olmadığı kontrol edilir.

### Kullanılan Assertion Türleri:

- **Assert.assertTrue(Koşul)**: Belirtilen koşulun doğru olmasını bekler.
- **Assert.assertFalse(Koşul)**: Belirtilen koşulun yanlış olmasını bekler.
- **Assert.assertEquals(expected, actual)**: İki değerin eşit olmasını bekler


## ⚙️ Testi Çalıştırmak

1. **Gerekli Kütüphanelerin Yüklenmesi**:
   - `JUnit` ve `Selenium WebDriver` bağımlılıklarını pom.xml (Maven) veya build.gradle (Gradle) dosyasına ekleyin.

2. **Testi Çalıştırmak**:
   - IDE (Eclipse, IntelliJ IDEA vb.) üzerinden veya komut satırından JUnit testlerini çalıştırabilirsiniz.

3. **Sonuçların Kontrolü**:
   - Test çalıştırıldığında, belirtilen arama sonucunun içeriğinde "Nutella" kelimesinin olup olmadığı doğrulanacaktır.

## 🔑 Test Çıktıları

Testin başarılı olup olmadığını doğrulamak için **JUnit assertion** kullanılmıştır. Eğer arama sonucunda "Nutella" kelimesi bulunmazsa test başarısız olur ve hata mesajı görüntülenir.

## 📦 Bağımlılıklar

- **Selenium WebDriver**
- **JUnit**
- **WebDriverManager**

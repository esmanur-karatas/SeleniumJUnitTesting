# Selenium JUnit Test

Bu depo, **Selenium WebDriver** ve **JUnit** kullanarak yazılmış iki ayrı projeyi içermektedir: **AssertionClass** ve **TestStudyNotes**. Her iki proje, web otomasyon testlerini içermektedir ve temel olarak testlerin nasıl yapılandırılacağı, nasıl doğrulama yapılacağı ve test metodlarının nasıl çalıştırılacağı hakkında örnekler sunmaktadır.

## 📂 Projeler

### 1. **AssertionClass**

- **Amaç**: Bu proje, Selenium ile yapılan testlerde doğru ve yanlış koşullara göre doğrulama işlemlerini gerçekleştirmek için **JUnit Assertion** kullanmayı göstermektedir. `Assert.assertTrue()`, `Assert.assertFalse()`, ve `Assert.assertEquals()` gibi temel assertion yöntemleri ile testlerin doğru çalışıp çalışmadığı kontrol edilir.
- **Senaryo**: Amazon sayfasına gidilir, arama kutusuna "Nutella" yazılır ve arama sonucu doğrulanır.

### 2. **TestStudyNotes**

- **Amaç**: Bu proje, **JUnit** test çerçevesiyle farklı web sitelerinde gezinti yapmayı ve her testin ayrı bir web sayfasına gitmesini sağlamayı amaçlamaktadır. **@BeforeClass** ve **@AfterClass** anotasyonları ile ortak ayarlar yapılır, her bir test metodunda ise farklı sitelere gidilir.
- **Senaryo**: Amazon, Facebook ve LinkedIn sitelerine gidilerek, her biri için basit navigasyon testleri yapılır.

## 🛠️ Kullanılan Araçlar ve Teknolojiler

- **Selenium WebDriver**: Web tarayıcı etkileşimini otomatikleştirmek için kullanılır.
- **JUnit**: Testlerin yazılması ve çalıştırılması için kullanılan Java tabanlı test framework'üdür.
- **WebDriverManager**: Tarayıcı sürücülerini otomatik olarak yönetir.

## 📋 Projelerde Kullanılan JUnit Özellikleri

### **@BeforeClass**
- Testler başlamadan önce bir kez çalıştırılır ve ortak ayarları yapar.

### **@AfterClass**
- Testler tamamlandıktan sonra bir kez çalıştırılır ve temizlik işlemleri yapılır (örneğin, tarayıcının kapatılması).

### **@Test**
- Gerçek testlerin yazıldığı metodları belirtir.

### **Assertion Yöntemleri**
- **Assert.assertTrue(Koşul)**: Koşul doğru olmalıdır.
- **Assert.assertFalse(Koşul)**: Koşul yanlış olmalıdır.
- **Assert.assertEquals(expected, actual)**: Beklenen değer ile gerçek değer karşılaştırılır.

## 📂 Dosya Yapısı


## ⚙️ Testi Çalıştırmak

1. **Gerekli Kütüphanelerin Yüklenmesi**:
   - `JUnit` ve `Selenium WebDriver` bağımlılıklarını pom.xml (Maven) veya build.gradle (Gradle) dosyasına ekleyin.

2. **Testi Çalıştırmak**:
   - IDE (Eclipse, IntelliJ IDEA vb.) üzerinden veya komut satırından JUnit testlerini çalıştırabilirsiniz.

3. **Sonuçların Kontrolü**:
   - Test çalıştırıldığında, belirtilen sitelere gidilir ve testler belirtilen adımlar doğrultusunda gerçekleştirilir.

## 🔑 Test Çıktıları

Testler başarılı şekilde çalıştırıldığında, her testin belirtilen web sayfasına gidilmesi sağlanır. **AssertionClass** projesi arama sonuçlarını doğrularken, **TestStudyNotes** projesi belirtilen web sitelerinde gezinir.

## 📦 Bağımlılıklar

- **Selenium WebDriver**
- **JUnit**
- **WebDriverManager**

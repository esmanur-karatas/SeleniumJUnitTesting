# TestStudyNotes - JUnit ile Web Testleri

Bu proje, **JUnit** ile **Selenium WebDriver** kullanarak yapılan basit web testlerini içermektedir. Testler, farklı web sitelerinin sayfalarına gidilerek doğrulama yapılacak şekilde hazırlanmıştır. Bu projede, JUnit test döngüsü ve test metodları arasında ortak ayarların nasıl yapılacağını ve her bir testin nasıl bağımsız çalıştırılacağını görmek mümkündür.

## 🛠️ Kullanılan Araçlar ve Teknolojiler

- **Selenium WebDriver**: Web tarayıcı etkileşimini otomatikleştirmek için kullanılır.
- **JUnit**: Testlerin yazılması ve çalıştırılması için kullanılan Java tabanlı bir test framework'üdür.
- **WebDriverManager**: Tarayıcı sürücülerini otomatik olarak yönetir.

## 📋 Testin İçeriği

### Test Senaryoları:

1. **Test 1**: Amazon sitesine gidilir.
2. **Test 2**: Facebook sitesine gidilir.
3. **Test 3**: LinkedIn sitesine gidilir.

### JUnit Özellikleri:

- **@BeforeClass**: Tüm testler başlamadan önce bir kere çalıştırılır ve ortak ayarları yapar.
- **@AfterClass**: Tüm testler bittikten sonra bir kere çalıştırılır ve temizlik işlemleri yapılır (örneğin, tarayıcının kapatılması).
- **@Test**: Her bir test fonksiyonunu belirtir.

### Kullanılan Anotasyonlar:

- **@BeforeClass**: Testler başlamadan önce yapılması gereken ayarları içerir.
- **@AfterClass**: Testler tamamlandıktan sonra yapılması gereken temizlik işlemleri içerir.
- **@Test**: Gerçek testlerin yazıldığı metodları belirtir.


## ⚙️ Testi Çalıştırmak

1. **Gerekli Kütüphanelerin Yüklenmesi**:
   - `JUnit` ve `Selenium WebDriver` bağımlılıklarını pom.xml (Maven) veya build.gradle (Gradle) dosyasına ekleyin.

2. **Testi Çalıştırmak**:
   - IDE (Eclipse, IntelliJ IDEA vb.) üzerinden veya komut satırından JUnit testlerini çalıştırabilirsiniz.

3. **Sonuçların Kontrolü**:
   - Test çalıştırıldığında, belirtilen sitelere gitmek için tarayıcıyı açacak ve her bir siteyi test edecektir.

## 🔑 Test Çıktıları

Testler başarılı şekilde çalıştırıldığında, belirtilen sitelere yönlendiren tarayıcı açılacaktır. Testler herhangi bir doğrulama veya hata yapmaz, sadece belirtilen sayfalara gidilir.

## 📦 Bağımlılıklar

- **Selenium WebDriver**
- **JUnit**
- **WebDriverManager**

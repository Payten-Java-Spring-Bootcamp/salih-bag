# salih-bag

Hafta-1 Ödev

1.	Pass by value, pass by reference kavramları nedir ? Java’ ile ilişkili olarak açıklayınız.

Pass by value’da, bir fonksiyon parametresinin değeri hafızanın başka bir yerine kopyalanır. İşlev içindeki değişkene erişirken veya değişkeni değiştirirken, yalnızca kopyaya erişir. Bu nedenle, orijinal değer üzerinde herhangi bir etkisi yoktur. Pass by reference’da, hafıza adresi o fonksiyona iletilir. Başka bir deyişle, işlev gerçek değişkene erişim sağlar.
Pass by value, işlev parametre değerinin başka bir değişkene kopyalanması mekanizmasına atıfta bulunurken, pass by reference, gerçek parametreleri işleve geçirme mekanizmasına atıfta bulunur. Dolayısıyla, aralarındaki temel fark budur.

2.	Immutability nedir, neden önemlidir ? Bir Java sınıfı nasıl immutable yapılır ?

Bir nesne, oluşturulduktan sonra durumu değişemiyorsa değişmez olarak kabul edilir. Immutable nesnelere maksimum güven, basit, güvenilir kod oluşturmak için sağlam bir strateji olarak yaygın olarak kabul edilir. Immutable nesneler özellikle, çok iş parçacıklı (multi-threaded) ortamlarda ve streamlerde kullanışlıdır. Durum değiştiremedikleri için iş parçacığı girişimi (multi-threaded) ile bozulamazlar veya tutarsız bir durumda gözlemlenemezler.

Yazılımcılar, bir nesneyi yerinde güncellemek yerine yeni bir nesne oluşturmanın maliyeti konusunda endişelendikleri için, genellikle değişmez nesneler kullanmakta isteksizdirler. Nesne oluşturmanın etkisi genellikle olduğundan fazla tahmin edilir ve değişmez nesnelerle ilişkili bazı verimliliklerle dengelenebilir. Bunlar, garbage collection nedeniyle azalan ek yükü ve değiştirilebilir nesneleri bozulmadan korumak için gereken kodun ortadan kaldırılmasını içerir.

Immutable class oluşturmak için gerekli olan özellikler şu şekilde sıralanabilir:
•	Class içerisinde tanımlanan değişkenler private olmalı. Çünkü dışarıdan herhangi bir müdahalede bulunulmamalı.
•	Class içerisindeki değişkenlerin setter methodları olmamalı. Bu da dışarıdan gelecek müdahalelere karşı sıkı bir önlem.
•	Değişkenler final olarak işaretlenmeli, final işaretlenen değişkenler ilk değeri aldıktan sonra değiştirilemezler.
•	Final işaretlenen bu alanların ilk değerleri constructur ile verilmeli.
•	Extend edilmemesi gerektiği için class da final işaretlenmeli.

3.	Framework ve library arasındaki fark nedir ?

Hem frameworkler hem de kütüphaneler, başka programcılar tarafından yazılmış olan ve sizi satırlarca kod yazmaktan kurtaracak hayatınızı kolaylaştıracak kodlar bütünüdür. Library ile framework arasındaki temel fark, "Inversion of Control" dur. Bir kütüphaneden bir metod çağırdığınızda, kontrol sizdedir. Ancak bir framework ile kontrol tersine çevrilir: framework sizi çağırır.


4.	Java’da Garbage Collector’ un görevi nedir ?

Java’da bellek yönetimi arka planda JVM ve onun içinde yer alan Garbage Collector(Çöp Toplayıcısı) ile yapılır. Garbage Collection, otomatik bellek yönetimi mekanizmasıdır. Bu işlem heap belleğe bakıp, kullanılan objelerin tespit edilmesi ve referans edilmeyenlerin silinmesi üzerine kuruludur. Kullanılmayan/referans edilmeyen nesnelerin kapladığı alan bellekte boşa çıkarılır ve bellekte boş yer açılmış olur. Bu işlemi yapan mekanizmaya da Garbage Collector denir. Bu aslında Java’yı Java yapan özelliklerden biridir. Çünkü bir geliştirici olarak endişe duymadan yeni nesneler yaratırsınız ve GC sizin için memory allocation ve deallocation işlemlerini yapar. Yani JVM bunu sizin için yönetir. C/C++ gibi dillerde bunun kontrolü sizin elinizdedir. Bu durum yazılımda hata çıkma ihtimalini arttırır ve geliştirme sürecini uzatabilir.

5.	Memory leak nedir ? Java’da memory leak oluşması mümkün müdür ?

“Memory leak”, programın kullandığı hafıza ile işi bittiği halde ilgili hafıza bloğunu serbest bırakmaması durumudur. Bu durum;
•	Gerçekte kullanılmayan hafıza bloklarının referans edilmeye devam edilmesinden veya
•	Native resource’ların düzgün bir şekilde serbest bırakılmamasından
kaynaklanmaktadır. Zaman içerisinde programın sürekli hafıza kullanması, fakat kullandığı hafızayı işi bittiğinde bırakmaması, memory leak’in giderek büyümesine bundan dolayı yeterince uzun süre çalışan uygulamalarda sistem kaynaklarının kritik miktarlarda tüketilmesine ve uygulamanın hata verip kapanmasına sebep olmaktadır.

Garbage collector hafızada referans edilmeyen, kullanımı sona ermiş olan hafıza bloklarını bulup, serbest bırakmaktadır. Fakat hâlen referans olarak gösterilen ve kullanılmasa da kullanımda görünen hafıza bloklarına ve unmanaged (native) kaynaklara dokunmamaktadır. Bu yüzden garbage collector’un memory leak’lere engel olduğuna dair bir kanıya sahip olmak oldukça yanlıştır. Çünkü memory leak durumunda kullanımı sona ermiş olan hafıza bloğu halen referans edilmeye devam edildiğinden veya unmanaged (native) kaynak kullanılmaya devam edildiğinden garbage collector tarafından bu hafıza bloğu serbest bırakılmayacaktır.

6.	Yeni Java sürümleri ne sıklıkla çıkmaktadır ?

Uzun vadeli destek sürümleri her 3 yılda bir yayınlanır. Uzun vadeli olmayan destek sürümleri her 6 ayda bir yayınlanır.

7.	Stack ve Heap nedir ? Java’da hangi yapılar stack ile, hangi yapılar heap ile ilişkilidir ?

•	Stack ve Heap ram’in mantıksal bölümleridir.
•	Stack LIFO mantığında çalışır. Yani son gelen ilk olarak çıkar.
•	Stack’de değer tipleri, pointer ve adresler saklanırken Heap’de ise referans değerleri saklanır.
•	Stack daha hızlıdır. Ulaşılmak istenen veriler ard arda sıralanmış olur.
•	Heap ortak olarak kullanılır ve uygulama başlatıldığında başlar.

Eğer program esnasında boyutları bildirilmiş değişmez bir değer kullanılıyorsa stack, değişebilir bir değer kullanılıyorsa heap uygundur. Stack ve heap kullanımları farklı ve dikkat edilmesi gereken bir konudur. Stack kullanılır ve işi bittikten sonra kendini otomatik olarak bellekten yok eder. Fakat heap‘te bu işi yazılımcı yapmalıdır.

8.	OpenJDK ve OracleJDK arasındaki farklar nelerdir ?

Oracle JDK, Oracle Binary Code License Agreement kapsamında lisanslanmıştır, oysa OpenJDK, GNU General Public License (GNU GPL) version 2′ye sahiptir. Oracle’ın platformunu kullanırken bazı lisanslama etkileri vardır. Oracle’ın açıkladığı gibi, Ocak 2019’dan sonra yayınlanan Oracle Java SE 8 için genel güncellemeler, ticari bir lisans olmadan, ticari veya üretim amaçlı kullanılmayacaktır. Ancak OpenJDK tamamen açık kaynaklıdır ve özgürce kullanılabilir.

Oracle JDK için derleme süreci OpenJDK’ya dayandığından, ikisi arasında teknik bir fark yoktur. Performans söz konusu olduğunda, Oracle yanıt verme ve JVM performansı açısından çok daha iyidir. Kurumsal müşterilerine verdiği önem nedeniyle istikrara daha fazla odaklanır. OpenJDK, aksine sürümleri daha sık teslim etmektedir. Sonuç olarak, istikrarsızlıkla ilgili sorunlarla karşılaşabilinir. Topluluk geri bildirimine dayanarak, bazı OpenJDK kullanıcılarının performans sorunlarıyla karşılaştığı bilinir.

9.	@FunctionalInterface anotasyonu nerelerde kullanılabilir, neleri sağlar ?

Function interface, içerisinde sadece bir tane abstract metodu olan interface’dir. Eğer ilgili interface’in türetildiği interface’de abstract metot varsa bu durumda da functional interface olur.
Functional interface’ler, lambda expression’ların kullanılabilmesi için tanımlanırlar.

10.	Java’da hangi functional interface’ler yer almaktadır ? Yaptığınız araştırmada en popüler/göze çarpanlar hangileridir ?

•	Predicate Interface
•	Consumer Interface
•	Supplier Interface
•	Function Interface


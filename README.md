# Lifecycle_Android_Kotlin

* onCreate()	: Bu	metod ile	birlikte	aktivite	yaratılır.
* onStart()	: Bu	metod ile	aktivite	artık	kullanıcı	tarafında	görünür	(visible)	
durumdadır.
* onResume()	: Bu	metod ile	birlikte	kullanıcı	artık	uygulama	ile	karşılıklı	iletişim	
halindedir.
* onPause()	: Bununla	beraber	artık	kullanıcıdan	herhangi	bir	girdi	alamaz	ve	
hiçbir	kod	çalıştırılamaz.
* onStop()	: Artık	aktivite	görünür	(visible)	durumda	değildir.
* onDestroy()	: Aktivite	sistem	tarafından	yok	edilmeden	önce	bu	metod çağırılır.
* onRestart()	: Aktivite	durdurulduktan	sonra	tekrar	başlatılmak	için	bu	metod
kullanılır.

## İlk Çalıştığında
* onCreate()
* onStart()
* onResume()

## Back	Tuşuna Basıldığında
* onPause()
* onStop()	
* onDestroy()

### Arka Plandan Tekrar Çağrıldığında
* onCreate()
* onStart()
* onResume()

## Menü Tuşuna Basıldığında
* onPause()
* onStop()

### Arka Plandan Tekrar Çağrıldığında
* onRestart()
* onStart()
* onResume()

## Arka plan tuşuna Basıldığında
* onPause()
* onStop()

### Arka Plandan Tekrar Çağrıldığında
* onRestart()
* onStart()
* onResume()

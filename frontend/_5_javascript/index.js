//single-line comment
/* multi-line comment */

//çıktı
// window.alert("Pop-up");
// alert("Pop-up");
// console.log("Console yani software level");
// document.write("Html çıktısı");

//variable
//var deneme;
// deneme="JavaScript dersi";
// deneme=3>1;
//deneme=44;
//alert(deneme)

//whoisting
// deneme="JavaScript dersi";
// var deneme;
// alert(deneme);

//syntax: ister çift tırnak ister tek tırnak backtick
// " " ==> çift tırnak
// ' ' ==> tek tırnak
// ` ` ==> backtick

// var kelime="Javascript";
// var tamsayi=44;
// var virgulluSayi=44.52;
// var object={};
// var dizi=[];

//variable syntax(common rules)
// var kelime=44;
// var kelime12=44;
// var $55kelime12=44;
// var _55kelime12=44;
// var kelime_diger=44;
//var sayisalTeknoloji;//camel case

// var 55kelime12=44;
// var kelime-diger=44;
// var +55kelime12=44;
// var ~55kelime12=44;

///////////////////////////////////////////////////////////////////
//operatörler
//logic operators      => ||=> veya     &=ve
//mathematics operator => + - * / %=bölümünden kalan
//comparison operator  =>  >  >=  <  <=   ==  ===(type)
//increment x++  ++x
// var docum=( 6+3*5+3-6/6);
// document.write(docum)

//typeof: değişken türü nedir
// var obj=44;
// var obj=34.55;
// var obj="merhabalar";
// var obj={};
// var obj=[];
// document.write(typeof obj)
//////////////////////////////////////////////////////////////////
//prompt: kullanıcıdan veri almak istediğimizde kullanıyoruz.
//prompt: dönüş değeri string'tir
// var sonuc=prompt("Lütfen adınızı giriniz");
// console.log(sonuc)

// var sayi1,sayi2,toplam=0;
// sayi1=Number(prompt("Lütfen 1.sayıyı giriniz")) ;
// sayi2=Number(prompt("Lütfen 2.sayıyı giriniz")) ;
// toplam=(sayi1+sayi2);
// console.log(toplam);

//string'i ==> sayıya çevirmek ==>  Number();
//sayıyı   ==> String çevirmek ==>  String();

//////////////////////////////////////////////////////////////////

// //undefined:tanımsız
//  var deneme;
// console.log( deneme)

// //NaN: Not a Number
// var result=4/"asd";
// console.log(result)

// //Infinity
// var infinite=9/0;
// console.log(infinite);

// // new
// // hafızada bir değer oluşturmak

// // null: olan hafızayı yok etmek
// var kelime=null;
// console.log(kelime)

// // this
// // nesneyi referans etmek

//////////////////////////////////////////////////////////////////
//escape character
// console.log("  \"  ")
// console.log('  \'  ')
// console.log("  '  ")
// console.log("  ``  ")
// console.log('  "  ')

/////////////////////////////////////////////////////////////////

//revize keyword : for, while,let,const,function değişkende kullanamazsınız
// var function=44;
// console.log(function)

/////////////////////////////////////////////////////////////////
//Math
// console.log(Math.PI);
// console.log(Math.E);
// console.log(Math.max(5,1,5,2,9,12222));
// console.log(Math.min(5,1,-545,2,9,12222));
// console.log("karekök: "+Math.sqrt(16));
// console.log("mutlak: "+Math.abs(-16));
// console.log("üst: "+Math.pow(2,5))
// console.log(Math.floor(12.9));
// console.log(Math.ceil(12.1));
// console.log(Math.round(4.4));
// console.log(Math.round(4.5));

///Random:rastgele
// console.log( Math.round(Math.random()*4+1));

//kullanıcıdan alınan iki sayıda (prompt,Number()) dört işlem yapacak
//iki sayı arasındaki en büyük sayının karekökü,mutlak değeri
//küçük sayı taban: büyük sayı üst olacak şekilde pow yapacağız

/////////////////////////////////////////////////////////////////
//SAYILAR
// var sayi1=44;
// var sayi1=44.56;
// var bilimselGosterim=412e+2;
// var bilimselGosterim=412e-2;
// console.log(bilimselGosterim)

// //başka tabanları => 10'a çevirmek
// //hexadecimal:16 tabanlı : 0123456789ABCDEF
// var hex=0xFF;
// console.log(hex)
// //output: 255

// //hexadecimal:16 tabanlı : 0123456789ABCDEF
// var bina=0b11;
// console.log(bina)
//output:3

// console.log("**************************************")
//10'luk tabandaki başka tabanlara çevirmek
// var decimal=44;
// console.log(decimal.toString(2));
// console.log(decimal.toString(8));
// console.log(decimal.toString(10));
// console.log(decimal.toString(16));

// var varible=44;
// console.log(Number(varible)+16) //sayıya çevir
// console.log(String(varible)+16) //String'e çevir

//NaN
// console.log(15/"asd")

//isNaN = bu sayı değil mi  ?
// var sayiMi=44;
// console.log(isNaN(sayiMi));

/////////////////////////////////////////////////////////////////
//KELİME

//kelime=" Enum collection Data structure primitive TYPe "

//Java ile JavaScript aynı method , function
// var kelime="http html5 CSS3 Js javase html5";
// kelime=String(kelime);

// console.log("karakter sayısı: "+kelime.length);
// console.log("Trim sayısı: "+kelime.trim().length);

// console.log("http ile mi başlıyor: "+kelime.startsWith("http"));
// console.log("javase ile mi bitiyor: "+kelime.endsWith("javase"));

// console.log("sona ekle "+kelime.concat(" -INC"));

// console.log(kelime.toUpperCase());
// console.log(kelime.toLowerCase());

// console.log("baştan arama "+kelime.indexOf("html5"));
// console.log("sondan "+kelime.lastIndexOf("html5"));

// console.log(kelime.charAt(0));

// console.log(kelime.replace(kelime,"frontend"));

// console.log(kelime.substring(1)); //sıfırdan başlar
// console.log(kelime.substring(1,6)); //sıfırdan başlar 1<=x<=5-1

// indexOf,lastIndexOf,search ==> arama için kullanıyoruz.
//  search daha ayrıntılı ve filtreleme yaparak arama işlemi yapar
//  var searchValue="Script script Script";
//  console.log(searchValue.indexOf("Script"))
//  console.log(searchValue.lastIndexOf("Script"))

//  console.log(searchValue.search("Script"));
//  console.log(searchValue.search("script"));
//  console.log(searchValue.search(/script/)); //case-sensitive
//  console.log(searchValue.search(/script/i)); //non-case-sensitive
//  console.log(searchValue.search("Java")); //olmayan değerlerde -1 döner

// slice,substring,substr
// charAt,charCodeAt

//stringify: objeyi String'e çevirmek
// var obje={"adi":"Hamit"};
// console.log(obje);

// var objeyistringeCevirdim=JSON.stringify(obje);
// console.log(objeyistringeCevirdim.substring(8,13));

// //parse: String'i Objeye çevirmek
// var stringObjeyeCevirdim=JSON.parse(objeyistringeCevirdim);
// console.log(stringObjeyeCevirdim);

///////////////////////////////////////////////////////////////////////////////
//Fonksion
//returnsuz parametresiz function
// function toplama1(){
//     var sayi1=10,sayi2=20,sonuc=0;
//     sonuc=sayi1+sayi2;
//     console.log(sonuc);
// }
// toplama1()

//returnsuz paramereli function
// function toplama2(sayi1,sayi2){
//     var sonuc=0;//toplama sıfır
//     sonuc=sayi1+sayi2;
//     console.log(sonuc);
// }
// toplama2(10,20);

// //returnlu parametresiz function
// function toplama3(){
//     var sayi1=10,sayi2=20,sonuc=0;
//     sonuc=sayi1+sayi2;
//    return sonuc;
// }
//  var toplamValue=  toplama3();
//  console.log(toplamValue)

//  //returnlu parametresiz function
// function toplama4(sayi1,sayi2){
//     sonuc=sayi1+sayi2;
//     var sonuc;
//    return sonuc;
// }
//  var toplamValue2=  toplama4(10,20);
//  console.log(toplamValue2)

///////////////////////////////////////////

//  //normal
//  function deneme1(){
//      console.log("normal function")
//  }
//  deneme1();
//
//  //anonymous function
//  var sonuc1= function (){
//     console.log("anonymous function")
// }
// sonuc1();
//
// //arrow function
// var sonuc2=  ()=>{
//     console.log("arrow function")
// }
// sonuc2();

//Immedia function
//()()
// (()=>{
//     //console.log("normal function")
// })();

///////////////////////////////////////////
//loop
//console.log(1+2+3+4+5+6+7+8+9+10+11+12+13+14+15)

//  //for
//  function donguFor (){
//     let sum=0;
//     //iterative for
//     for (let i = 1; i <= 10; i++) {
//         //sum=sum+i;
//         sum+=i;
//     }
//     console.log("toplam for: "+sum);
//  }
//  donguFor()

//   //while
//   function donguWhile (){
//     let sum=0;
//     let i = 1;
//     //iterative for
//     while ( i <= 10) {
//         //sum=sum+i;
//         sum+=i;
//        i++
//     }
//     console.log("toplam while: "+sum);
//  }
//  donguWhile()

//for while arasındaki farklar nelerdir ?

///////////////////////////////////////////
//conditional
// '44' ==> string
//  44  ==> number
// let number1 = () => {
//   const number = '44' //string
//   if (number == 44) {
//     console.log('aynı sayıdır')
//   } else {
//     console.log('farklı sayıdır')
//   }
// }
// number1()
// console.log("************************")

// let number2 = () => {
//   const number = '44' //string
//   if (number === 44) {
//     console.log('aynı sayıdır')
//   } else {
//     console.log('farklı sayıdır')
//   }
// }
// number2()
// console.log("************************")

// //ternary
// let number3 = () => {
//   const number = '44' //string
//   let result =number === 44 ? console.log('aynı sayıdır') : console.log('farklı sayıdır')
// }
// number3()

/////////////////////////////////////////////////////////
//1-50 arasındaki sayılar olsun (dahil)
//s1-) 1-50 sayıları toplayalım ?
//s2-) ancak sayılardan 5 sayının eklemesin
//s3-) revize bu sayıları sadece 1-10 arasında olması gerekiyor
//if , for, break, continue



# Börtön rejtvény

## Feladatleírás

Egy csoport informatikust elfognak és börtönbe zárnak.

A börtön cellái teljesen elszigeteltek, közöttük semmiféle kommunikáció nem zajlik.

Az informatikusokat kivégzik, de a börtönparancsnok ad nekik egy esélyt:
a börtön udvarán van egy kapcsoló, ami egy lámpát hoz működésbe - ez kezdetben le van kapcsolva.

Az informatikusokat egyesével kiengedik az udvarra, ahol úgy állítják (vagy nem állítják) be a kapcsolót, ahogy akarják, majd visszazárják őket.

A kiengedés sorrendje teljesen véletlenszerű, és egy embert többször is kihívhatnak.

Ha valaki meg tudja mondani, hogy már mindenki legalább egyszer volt kint az udvaron, akkor szabadon távozhatnak.

Ha ezt elég hosszú idő alatt nem tudják megmondani, vagy tévednek, azonnal kivégzik őket.

Mielőtt bezárják őket, van idejük megbeszélni egy startégiát.

## Megvalósítás
A rendelkezésetekre áll egy `Borton` osztály, amelynek statikus metódusait bárki használhatja:
```java
void lampaFelkapcsol();

void lampaLekapcsol();

void lampaAtkapcsol();

boolean lampaVilagit();

int foglyokSzama();
```

A `hu.flowacademy.lecture8.prisonBreak.prisoners` package-ben hozzatok létre egy osztályt (tetszőleges néven, de mindenkinek legyen egyedi neve),
ami a `hu.flowacademy.lecture8.prisonBreak.Bortontoltelek` abstract osztályból __öröklődik__.

A csapat feladata, hogy mindenki írja meg a saját `Bortontoltelek` implementációját:
* a `String neve()` adja vissza mindenki nevét/nicknevét/bármit, amiről tudni fogjuk ki írta
* a `boolean voltKintMindenki()` függvényt pedig mindenki valósítsa meg, úgy, hogy a `Borton` osztály statikus metódusait felhasználva,
meg tudjuk mondani, hogy volt-e kint már midenki __legalább__ egyszer
  
Üljetek össze, találjatok ki egy megoldást, és implementáljátok le! Vigyázzatok, hogy ne térjetek korábban vissza `true`-val, mielőtt tényleg biztosra mennétek!

Egy dummy megvalósítást találtok a `hu.flowacademy.lecture8.prisonBreak.prisoners.MintaElek` osztályban:
```java
public class MintaElek extends Bortontoltelek {
    @Override
    public String neve() {
        return "Minta Elek";
    }

    @Override
    public boolean voltKintMindenki() {
        return new Random().nextBoolean();
    }
}
```

A megvalósított osztályt töltsétek fel ugyanebbe a GitHub repóba.

Jó munkát! 💪

## Credit
A feladatleírás a Szegedi Tudományegyetem Szoftvefejlesztés Tanszékétől származik, így azt a feladat szövegezésével kapcsolatos összes jog megilleti.
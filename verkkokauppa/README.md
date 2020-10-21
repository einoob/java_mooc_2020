
## Osa 1: Varasto

Tee luokka Varasto jolla on seuraavat metodit:

<li>public void lisaaTuote(String tuote, int hinta, int saldo) lisää varastoon tuotteen jonka hinta ja varastosaldo ovat parametrina annetut luvut</li>
<li>public int hinta(String tuote) palauttaa parametrina olevan tuotteen hinnan, jos tuotetta ei ole varastossa, palauttaa metodi arvon -99.</li>
Varaston sisällä tuotteiden hinnat (ja seuraavassa kohdassa saldot) tulee tallettaa Map<String, Integer>-tyyppiseksi määriteltyyn muuttujaan! Luotava olio voi olla tyypiltään HashMap, muuttujan tyyppinä on käytettävä Map-rajapintaa.


## Osa 2: Tuotteen varastosaldo

Tuotteen varastosaldo
Aseta tuotteiden varastosaldot samaan tapaan Map<String, Integer>-tyyppiseen muuttujaan kuin hinnat. Täydennä varastoa seuraavilla metodeilla:

<li>public int saldo(String tuote) palauttaa parametrina olevan tuotteen varastosaldon. Jos tuotetta ei ole varastossa lainkaan, tulee palauttaa 0.</li>
<li>public boolean ota(String tuote) vähentää parametrina olevan tuotteen saldoa yhdellä ja palauttaa true jos tuotetta oli varastossa. Jos tuotetta ei ole varastossa, palauttaa metodi false, tuotteen saldo ei saa laskea alle nollan.</li>

## Osa 3: Tuotteiden listaus

Listätään varastolle vielä yksi metodi:

<li>public Set<String> tuotteet() palauttaa joukkona varastossa olevien tuotteiden nimet.</li>
Metodi on helppo toteuttaa HashMapin avulla. Saat tietoon varastossa olevat tuotteet kysymällä ne joko hinnat tai saldot muistavalta Map:iltä metodin keySet avulla.
  
## Osa 4: Ostos

Ostoskoriin lisätään ostoksia. Ostoksella tarkoitetaan tiettyä määrää tiettyjä tuotteita. Koriin voidaan laittaa esim. ostos joka vastaa yhtä leipää tai ostos joka vastaa 24:ää kahvia.

Tee luokka Ostos jolla on seuraavat toiminnot:

<li>public Ostos(String tuote, int kpl, int yksikkohinta) konstruktori joka luo ostoksen joka vastaa parametrina annettua tuotetta. Tuotteita ostoksessa on kpl kappaletta ja yhden tuotteen hinta on kolmantena parametrina annettu yksikkohinta</li>
<li>public int hinta() palauttaa ostoksen hinnan. Hinta saadaan kertomalla kappalemäärä yksikköhinnalla</li>
<li>public void kasvataMaaraa() kasvattaa ostoksen kappalemäärää yhdellä</li>
<li>public String toString() palauttaa ostoksen merkkijonomuodossa, joka on alla olevan esimerkin mukainen</li>

## Osa 5: Ostoskori

Vihdoin pääsemme toteuttamaan luokan ostoskori!

Ostoskori tallettaa sisäisesti koriin lisätyt tuotteet Ostos-olioina. Ostoskorilla tulee olla oliomuuttuja jonka tyyppi on joko Map<String, Ostos> tai List<Ostos>. Älä laita mitään muita oliomuuttujia ostoskorille kuin ostosten talletukseen tarvittava Map tai List.

Huom: jos talletat Ostos-oliot Map-tyyppiseen apumuuttujaan, on tässä ja seuraavassa tehtävässä hyötyä Map:in metodista values(), jonka avulla on helppo käydä läpi kaikki talletetut ostos-oliot.

Tehdään aluksi ostoskorille parametriton konstruktori ja metodit:

<li>public void lisaa(String tuote, int hinta) lisää ostoskoriin ostoksen joka vastaa parametrina olevaa tuotetta ja jolla on parametrina annettu hinta.</li>
<li>public int hinta() palauttaa ostoskorin kokonaishinnan</li>

## Osa 6: Ostoskorin tulostus
Tehdään ostoskorille metodi public void tulosta() joka tulostaa korin sisältämät Ostos-oliot. Tulostusjärjestyksessä ei ole merkitystä.

## Osa 7: Yksi ostos tuotetta kohti
Täydennetään Ostoskoria siten, että jos korissa on jo tuote joka sinne lisätään, ei koriin luoda uutta Ostos-olioa vaan päivitetään jo korissa olevaa tuotetta vastaavaa ostosolioa kutsumalla sen metodia kasvataMaaraa().


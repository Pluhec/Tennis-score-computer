# Počítadlo na skóre v tenise

Tento program je jednoduché počítadlo pro tenisový zápas, vytvořené v rámci školního projektu. Program funguje na základě uživatelského vstupu a bez použití knihoven či pokročilých funkcí. Je navržen tak, aby pomohl pochopit základní logiku počítání skóre v tenise.

## 📋 Popis programu

Program počítá skóre pro dva hráče (domácí a hosté) podle tenisových pravidel. Obsahuje následující funkce:

1. **Bodování**: Přidává body pro hráče na základě vstupu uživatele.
2. **Výhody (AD)**: Sim
3. **Gemy a sety**: Sleduje průběh her a počítá gemy a sety podle pravidel tenisu.
4. **Konec zápasu**: Program končí, jakmile jeden z hráčů vyhraje dva sety.

## 🛠️ Funkcionalita

1. **Ovládání:**
   - Uživatel zadává, kdo získal bod (`1` pro domácí, `2` pro hosty).
   - Program kontroluje správnost vstupu a pokračuje pouze s platnými hodnotami.

2. **Bodování:**
   - Bodové hodnoty postupují od 0 přes 15, 30 a 40.
   - Po dosažení skóre 40 bodů sleduje systém "výhody" (`AD`) pro rozhodnutí o vítězství v hře.

3. **Výpočet gemů a setů:**
   - Po vítězství v hře se přidává gem hráči.
   - Pokud hráč získá 6 gemů s rozdílem alespoň 2, získá set.
   - První hráč, který vyhraje dva sety, vyhrává zápas.

4. **Výstup:**
   - Program vypisuje aktuální stav hry, gemů a setů po každém vstupu.
   - Na konci oznamuje vítěze zápasu.

## 📂 Struktura kódu

Program se skládá z jednoduché smyčky `do-while`, která zajišťuje:
- Počítání bodů, gemů a setů.
- Kontrolu stavu pro ukončení zápasu.
- Výpis aktuálního skóre.

## 🚀 Použití

1. Spusťte program v prostředí, které podporuje Javu.
2. Zadejte, kdo získal bod (`1` pro domácí, `2` pro hosty).
3. Sledujte, jak se skóre mění, a pokračujte, dokud jeden z hráčů nevyhraje zápas.

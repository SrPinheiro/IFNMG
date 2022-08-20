# Ler 80 números e ao final informar quantos número (s) est (á) ão no intervalo entre 10 (inclusive) e 150
# (inclusive).

lista = list()

for i in range(0, 80):
    nmr = float(input('Digite um número: '))
    if (nmr >=10 and nmr <=150):
        lista.append(nmr)

print(f"Existem {len(lista)} números no intervalo entre 10(inclusive) e 15(inclusive)")
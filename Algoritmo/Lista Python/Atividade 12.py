#Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

lista = list()
c = 0
while (c != 3):
    n = float(input('Digite um valor para ser adicionado na lista: '))
    if n not in lista:
        lista.append(n)
        print('Valor adicionado com sucesso!')
        c = c+1
    else:
        print('Valor não adicionado, por favor digite outro número!')

lista.sort()

print(f'A  soma dos dois maiores valores da lista é: {lista[-1] + lista[-2]}')
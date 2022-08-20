# 21. Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades dos homens
# serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma das idades do homem
# mais velho com a mulher mais nova, e o produto das idades do homem mais novo com a mulher mais velha.

yearman_inorder = list()
yearwoman_inorder = list()

yearwoman = int(input('Digite a idade da primeira  mulher: '))
yearwoman_inorder.append(yearwoman)
yearwoman2 = int(input('Digite a idade da segunda mulher: '))

while (yearwoman == yearwoman2):
    print('A idades não podem ser iguais! Digite uma idade diferente.')
    yearwoman2 = int(input('Digite a idade da segunda mulher: '))

yearwoman_inorder.append(yearwoman2)


yearman = int(input('Digite a idade do primeiro homem: '))
yearman_inorder.append(yearman)
yearman2 = int(input('Digite a idade do segundo homem: '))
while (yearman == yearman2):
    print('A idades não podem ser iguais! Digite uma idade diferente.')
    yearman2 = int(input('Digite a idade do segundo homem: '))

yearman_inorder.append(yearman2)

soma = min(yearwoman_inorder) + max(yearman_inorder)
produto = min(yearman_inorder) * max(yearwoman_inorder)

print('=-'*30)
print(f'Soma da idade mais nova e o homem mais velho: {soma}')
print(f'Produto da idade mais velha e o homem mais novo: {produto}')
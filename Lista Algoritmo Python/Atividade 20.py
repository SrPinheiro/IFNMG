# 20. Escrever um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou mulher.
# No final informe total de homens e de mulheres.
man = list()
woman = list()

for i in range(0, 56):
    name = str(input('Digite o nome: '))
    sex = str(input('Digite o sexo (F = Feminino, M = Masculino): '))
    sex = sex.upper()

    if (sex == "F"):
        woman.append(sex)
        print(f'Nome: {name} \n {name} é mulher!')

    if (sex == "M"):
        man.append(sex)
        print(f'Nome: {name} \n {name} é homem!')

print('=-'*30)
print(f'Total de homens: {len(man)}')
print(f'Total de mulheres: {len(woman)}')



    


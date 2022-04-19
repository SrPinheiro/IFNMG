# 22. Escrever um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta
# ou não para cumprir o serviço militar obrigatório. Informe os totais.

i = int(input('Digite o número de pessoas que deseja verificar: '))
aptos = 0
nao_aptos = 0

for i in range(i):
    name = str(input('Digite o nome: '))
    sex = str(input(f'Digite o sexo de {name} (F = Feminino ou M = Masculino): '))
    sex = sex.upper()
    year = int(input(f'Digite a idade de {name}: '))
    health = str(input(f'Digite o estado de saúde de {name} (BOM ou RUIM): '))
    health = health.upper()

    if (sex == 'M' and health == 'BOM' and year >= 18):
        print(f'{name} está apto para se alistar no exército!')
        aptos = aptos + 1
    else:
        print(f'{name} não está apto para ingressar no exercito!')
        nao_aptos = nao_aptos + 1

print('=-'*30)
print(f'Pessoas aptas: {aptos}\n Pessoas não aptas: {nao_aptos}')


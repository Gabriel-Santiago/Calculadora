import math

while True:

    print('------------------ BEM VINDO ------------------')

    print("Escolha uma das operações:")
    print("1 - Soma")
    print("2 - Subtração")
    print("3 - Multiplicação")
    print("4 - Divisão")
    print("5 - Potência")
    print("6 - Raiz")
    print("7 - Logaritmo")
    print("8 - Fatorial")
    print("9 - Seno")
    print("10 - Cosseno")
    print("11 - Tangente")
    print("12 - Seno Hiperbólico")
    print("13 - Cosseno Hiperbólico")
    print("14 - Tangente Hiperbólica")
    print("15 - Cossecante")
    print("16 - Secante")
    print("17 - Cotangente")
    print("18 - Cossecante Hiperbólica")
    print("19 - Secante Hiperbólica")
    print("20 - Cotangente Hiperbólica")

    op = int(input())

    if 0 < op < 21:

        if op == 1:
            num = float(input('Digite o primeiro valor: '))
            num2 = float(input('Digite o segundo valor: '))
            print(num, '+', num2, '=', (num + num2))

        elif op == 2:
            num = float(input('Digite o primeiro valor: '))
            num2 = float(input('Digite o segundo valor: '))

            print('\nResultado:\n')
            print(num, '-', num2, '=', (num - num2))

        elif op == 3:
            num = float(input('Digite o primeiro valor: '))
            num2 = float(input('Digite o segundo valor: '))

            print('\nResultado:\n')
            print(num, '*', num2, '=', (num * num2))

        elif op == 4:
            num = float(input('Digite o primeiro valor: '))
            num2 = float(input('Digite o segundo valor: '))
            if num2 == 0:
                print('Digite outro valor, não pode divisão por 0')
                num2 = float(input('Digite o segundo valor: '))

            print('\nResultado:\n')
            print(num, '/', num2, '=', (num / num2))

        elif op == 5:
            num = float(input('Digite o primeiro valor: '))
            num2 = float(input('O número anterior vai ser elevado a: '))

            print('\nResultado:\n')
            print(num, '^', num2, '=', (num ** num2))

        elif op == 6:
            num = float(input('Digite o primeiro valor: '))
            num2 = float(input('Digite o valor do índice: '))

            print('\nResultado:\n')
            print(num, 'raiz', num2, '=', (num ** (1 / num2)))

        elif op == 7:
            num = float(input('Digite o primeiro valor: '))
            num2 = float(input('Digite o valor da base: '))
            num3 = math.log(num) / math.log(num2)

            print('\nResultado:\n')
            print('Log de', num, 'na base', num2, '=', num3)

        elif op == 8:
            num = int(input('Digite o valor: '))

            if num == 1 or num == 0:
                print('\nResultado:\n')
                print('O fatorial de', num, 'é 1')
            elif num < 0:
                print('Não existe fatorial de número negativo!')
            else:
                fatorial = 1
                i = 2

                while i <= num:
                    fatorial *= i
                    i += 1

                print('\nResultado:\n')
                print('Fatorial de', num, 'é', fatorial)

        elif op == 9:
            num = float(input('Digite o valor do seno em graus: '))

            num2 = num * (math.pi / 180)

            print('\nResultado:\n')
            print('O seno de %d°' % num, 'é', math.sin(num2))

        elif op == 10:
            num = float(input('Digite o valor do cosseno em graus: '))

            num2 = num * (math.pi / 180)

            print('\nResultado:\n')
            print('O cosseno de %d°' % num, 'é', math.cos(num2))

        elif op == 11:
            num = float(input('Digite o valor da tangente em graus: '))

            num2 = num * (math.pi / 180)

            print('\nResultado:\n')
            print('A tangente de %d°' % num, 'é', math.tan(num2))

        elif op == 12:
            num = float(input('Digite o valor do seno hiperbólico em graus: '))

            num2 = num * (math.pi / 180)

            print('\nResultado:\n')
            print('O seno hiperbólico de %d°' % num, 'é', math.sinh(num2))

        elif op == 13:
            num = float(input('Digite o valor do cosseno hiperbólico em graus: '))

            num2 = num * (math.pi / 180)

            print('\nResultado:\n')
            print('O cosseno hiperbólico de %d°' % num, 'é', math.cosh(num2))

        elif op == 14:
            num = float(input('Digite o valor da tangente hiperbólico em graus: '))

            num2 = num * (math.pi / 180)

            print('\nResultado:\n')
            print('A tangente hiperbólico de %d°' % num, 'é', math.tanh(num2))

        elif op == 15:
            num = float(input('Digite o valor da cossecante em graus: '))

            num2 = num * (math.pi / 180)

            print('\nResultado:\n')
            print('A cossecante de %d°' % num, 'é', (1 / math.sin(num2)))

        elif op == 16:
            num = float(input('Digite o valor da secante em graus: '))

            num2 = num * (math.pi / 180)

            print('\nResultado:\n')
            print('A secante de %d°' % num, 'é', (1 / math.cos(num2)))

        elif op == 17:
            num = float(input('Digite o valor da cotangente em graus: '))

            num2 = num * (math.pi / 180)

            print('\nResultado:\n')
            print('A cotangente de %d°' % num, 'é', (1 / math.tan(num2)))

        elif op == 18:
            num = float(input('Digite o valor da cossecante hiperbólica em graus: '))

            num2 = num * (math.pi / 180)

            print('\nResultado:\n')
            print('A cossecante hiperbólica de %d°' % num, 'é', (1 / math.sinh(num2)))

        elif op == 19:
            num = float(input('Digite o valor da secante hiperbólica em graus: '))

            num2 = num * (math.pi / 180)

            print('\nResultado:\n')
            print('A secante hiperbólica de %d°' % num, 'é', (1 / math.cosh(num2)))

        elif op == 20:
            num = float(input('Digite o valor da cotangente hiperbólica em graus: '))

            num2 = num * (math.pi / 180)

            print('\nResultado:\n')
            print('A cotangente hiperbólica de %d°' % num, 'é', (1 / math.tanh(num2)))

    else:
        break

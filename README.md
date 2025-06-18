# 🧪 Desafios Lógicos em Java

Este repositório contém a resolução de dois desafios básicos de programação em **Java**, utilizando `Scanner`, condicionais e tratamento de entrada de dados.

---

## 📧 Desafio 1 – Validação de E-mail

Verifica se o e-mail informado termina com o domínio `@company.com`.

### 🧾 Regras:
- Entrada: um e-mail no formato `nome@dominio`
- Saída:
  - Se termina com `@company.com`: `E-mail valido`
  - Caso contrário: `E-mail invalido`

### ✅ Exemplos:
| Entrada                    | Saída           |
|---------------------------|-----------------|
| joao.silva@company.com    | E-mail valido   |
| maria.silva@exemplo.com   | E-mail invalido |
| pedro.almeida@company.com | E-mail valido   |

---

## 🌡️ Desafio 2 – Conversão Celsius → Fahrenheit

Converte uma temperatura de Celsius para Fahrenheit, com validações.

### 🧾 Regras:
- Entrada: número decimal representando graus Celsius.
- A entrada deve ser ≥ -273.15 (zero absoluto)
- Saída:
  - Temperatura convertida com **1 casa decimal**.
  - Se a entrada for inválida: `Entrada invalida`

### ✅ Exemplos:
| Entrada | Saída            |
|---------|------------------|
| 25.0    | 77.0             |
| -300.0  | Entrada invalida |
| abc     | Entrada invalida |

---

## 🛠️ Tecnologias utilizadas
- Java 11+
- Scanner (entrada de dados)
- Condicionais (`if`, `else`)
- Métodos de string (`endsWith`)
- Impressão formatada (`System.out.printf`)

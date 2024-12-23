# Shipping Calculate App

Este projeto é uma **API REST** desenvolvida em **Spring Boot** para cálculo de valores de frete. A aplicação fornece diferentes opções de envio, aplicando fórmulas específicas para cada tipo de frete (Standard e Express).

---

## 🚀 Funcionalidades

- **Consulta de frete**: Calcule o valor do frete com base no tipo de envio, distância e peso.
- **Tipos de frete disponíveis**:
    - **Standard**: Mais acessível, indicado para entregas sem urgência.
    - **Express**: Mais caro, prioriza entregas rápidas.

---

## 🔢 Parâmetros de Envio (GET)

| Parâmetro       | Tipo   | Descrição                                 | Exemplo          |
|------------------|--------|-------------------------------------------|------------------|
| `tipo`          | String | Tipo de frete (`standard` ou `express`).  | `standard`       |
| `distancia`     | Double | Distância do envio (em quilômetros).      | `150.0`          |
| `peso`          | Double | Peso da carga (em quilogramas).           | `20.0`           |

---

## ⚙️ Regras de Cálculo

1. **Frete Standard**  
   Fórmula:
   ```
   custo = peso * 1.0 + distancia * 0.5
   ```
    - Mais econômico.
    - Ideal para entregas sem necessidade de urgência.

2. **Frete Express**  
   Fórmula:
   ```
   custo = peso * 1.5 + distancia * 0.75
   ```
    - Valor mais alto.
    - Priorizado para entregas rápidas.

---

## 📂 Estrutura do Projeto

```
com.wvsdev.shippingcalculate
├── domain
  ├── components     # Beans e componentes Spring
├── services         # Regras de negócio (cálculo do frete)
├── controller       # Controladores REST
├── dto              # Java records para response
```

---

## 🛠️ Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.4.1**
- **Spring Web** (para desenvolvimento da API REST)

---

## 🧩 Conceitos Explorados

- **Inversão de Controle (IoC)** e **Injeção de Dependências**:
    - Utilização de `@Component` e injeção de Beans com `@Autowired` e via construtor.
- **Divisão de responsabilidades**:
    - Separação de lógica de negócio na camada `Service`.

---

## ▶️ Como Executar

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/shipping-calculate-app.git
   cd shipping-calculate-app
   ```

2. **Execute o projeto**:
   ```bash
   ./mvnw spring-boot:run
   ```

3. **Teste os endpoints**:
    - **Endpoint Base**: `/api/v1/shipping/calculate`
    - Exemplo de consulta:
      ```bash
      GET /api/v1/shipping/calculate?tipo=standard&distancia=100&peso=10
      ```

---

## Happy Coding 🚀🚀🚀
Se tiver dúvidas ou sugestões, fique à vontade para contribuir!
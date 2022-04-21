class ContaBancaria {
  constructor(agencia, numero, tipo, saldo) {
    this.agencia = agencia
    this.numero = numero
    this.tipo = tipo
    this._saldo = 0
  }
  get saldo() {
    return 'Seu saldo é: ' + this._saldo
  }

  set saldo(val) {
    this._saldo = val
  }

  sacar(valor) {
    if (val < this._saldo) {
      return 'Operação Negada'
    } else {
      this._saldo = this._saldo - valor
      return this._saldo
    }
  }

  depositar(valor) {
    this._saldo = this._saldo + valor
    return this._saldo
  }
}

class ContaCorrente extends ContaBancaria {
  constructor(agencia, numero, cartaoCredito) {
    super(agencia, numero)
    this.tipo = 'corrente'
    this._cartaoCredito = cartaoCredito
  }

  get cartaoCredito() {
    return 'Numero do seu cartão é:' + this._cartaoCredito
  }
  set cartaoCredito(novo) {
    this._type = novo
  }
}

class ContaPoupaca extends ContaBancaria {
  constructor(agencia, numero) {
    super(agencia, numero)
    this.tipo = 'Poupança'
  }
}

class ContaUniversitaria extends ContaBancaria {
  constructor(agencia, numero) {
    super(agencia, numero)
    this.tipo = 'Universitaria'
  }
  sacar(valor) {
    if (valor > 500) {
      return 'Operação Invalida'
    } else {
      this._saldo = this._saldo - valor
    }
  }
}

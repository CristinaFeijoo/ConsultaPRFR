def Integral(f: Double => Double,a: Double, b: Double): Double = {
  val x_ = (a + b) / 2
  val res = (b - a) * (f(a) + 4 * f(x_) + f(b)) / 6
  res
}
//f representa la funcion que se esta integrando, por eso recibe un double y devuelve otro double
//a y b representan los limites


def calcularError(valorEsperado: Double, valorObtenido: Double): Double = math.abs(valorEsperado - valorObtenido)
//Se hace una funcion que calcule el error en la aproximacion de la integral completa, cuando ya se calculo con los limites


//En todas las funciones se usa el parametro (x: Double) el cual se calcula en la funcion integral, con los limites a y b
def function1(x: Double): Double = (-x * x) + (8 * x) - 12
val valorEsperado1 = 7.33
val valorObtenido1 = Integral(function1, 3, 5)
//Se usa la funcion integral con los parametros funcion1(la integral), a,b que son los limites
val error1 = calcularError(valorEsperado1, valorObtenido1)
//Se llama a la funcion calcular error y le damos los datos para que haga la operacion

def function2(x: Double): Double = 3 * (x*x)
val valorEsperado2 = 8.0
val valorObtenido2 =Integral(function2, 0, 2)
val error2 = calcularError(valorEsperado2, valorObtenido2)

def function3(x: Double): Double = x + 2 * x * x - (math.pow(x,3)) + 5 * Math.pow(x, 4)
val valorEsperado3 = 3.333
val valorObtenido3 = Integral(function3, -1, 1)
val error3 = calcularError(valorEsperado3, valorObtenido3)

def function4(x: Double): Double = {
  val p1 = 2 * x + 1 // Numerador
  val p2 = Math.pow(x, 2) + x // Denominador
  val result = p1 / p2
  result
}
val valorEsperado4 = 1.09861
val valorObtenido4 =Integral(function4, 1, 2)
val error4 = calcularError(valorEsperado4, valorObtenido4)

def function5(x: Double): Double = Math.pow(2.71828, x)
val valorEsperado5 = 1.71828
val valorObtenido5 = Integral(function5, 0, 1)
val error5 = calcularError(valorEsperado5, valorObtenido5)

def function6(x: Double): Double = 1 / (math.sqrt(x - 1))
val valorEsperado6 = 0.828427
val valorObtenido6 = Integral(function6, 2, 3)
val error6 =calcularError(valorEsperado6, valorObtenido6)

def function7(x: Double): Double = {
  val denominador = 1 + Math.pow(x, 2)
  val result = 1 / denominador
  result
}
val valorEsperado7 = 0.785398
val valorObtenido7 = Integral(function7, 0, 1)
val error7 =calcularError(valorEsperado7, valorObtenido7)

//Se presentan todos los ejercicios con su error de aproximacion
println("Error Ejercicio 1:  "+error1)
println("Error  Ejercicio 2: "+error2)
println("Error  Ejercicio 3: "+error3)
println("Error  Ejercicio 4: "+error4)
println("Error  Ejercicio 5: "+error5)
println("Error  Ejercicio 6: "+error6)
println("Error  Ejercicio 7: "+error7)
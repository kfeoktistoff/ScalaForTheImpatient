package chapter10.Exc04

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Kirill Feoktistov on 08.06.14
 */

trait CryptoLogger {
  var privateOffset: Int = 3
  private[this] val englishAlphabet: Array[Char] = ('a' to 'z').toArray
  private[this] var cipher: Map[Char, Char] = createCipher()

  def log(line: String) {
    print(encrypt(line))
  }

  private def encrypt(plainText: String) = {
    var cipherText: String = ""

    for (plainSymbol <- plainText) {
      val cipherSymbol = if (cipher.contains(plainSymbol.toLower)) cipher(plainSymbol.toLower) else plainSymbol
      cipherText += (if (plainSymbol.isUpper) cipherSymbol.toUpper else cipherSymbol)
    }

    cipherText
  }

  def offset = privateOffset

  def offset_=(newOffset: Int) {
    privateOffset = newOffset
    cipher = createCipher()
  }

  def createCipher() = {
    val newCipher: ArrayBuffer[Char] = new ArrayBuffer[Char](26)
    val alphabet = englishAlphabet

    for (symbol <- alphabet) {
      val index = if ((alphabet.indexOf(symbol.toLower) + offset) >= alphabet.length) {
        alphabet.indexOf(symbol.toLower) + offset - alphabet.length
      } else if (alphabet.indexOf(symbol.toLower) + offset < 0) {
        alphabet.indexOf(symbol.toLower) + offset + alphabet.length
      } else {
        alphabet.indexOf(symbol.toLower) + offset
      }

      newCipher += alphabet(index)
    }

    (englishAlphabet zip newCipher).toMap
  }

  def encryptSymbol(symbol: Char) = {
    if (englishAlphabet contains symbol.toLower) {
      val cipherSymbol = if (offset >= 0) englishAlphabet((englishAlphabet.indexOf(symbol.toLower) + offset) % 26)
      else
        englishAlphabet((englishAlphabet.reverse.indexOf(symbol.toLower) - offset) % 26)
      if (symbol.isUpper) cipherSymbol.toUpper else cipherSymbol
    }
    else
      symbol
  }

  def print(line: String) {
    println(line)
  }
}

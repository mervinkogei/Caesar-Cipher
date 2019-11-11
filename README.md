#  Introduction
* The Caesar cipher is one of the earliest known and simplest ciphers. It is a type of substitution cipher in which each letter in the plaintext is 'shifted' a certain number of places down the alphabet.


## Table of contents
* [Introduction](#introduction)
* [Technologies](#technologies)
* [Setup](#setup)
* [Features](#features)
* [Status](#status)
* [Reference](#Reference)
* [Author](#Author)

## Description

To pass an encrypted message from one person to another, it is first necessary that both parties have the 'key' for the cipher, so that the sender may encrypt it and the receiver may decrypt it. For the caesar cipher, the key is the number of characters to shift the cipher alphabet.

. 


## Technologies
* java- jdk11
* gradle

## Setup
* Install java preferably jdk 11
* Setup your IDE .Some great IDEs include Intellij and  netbeans.
* Clone the repository `github.com/mervinkogei/Caesar-Cipher`
* Open the IDE in the created directory
## Code Examples
Encryption code:

`public String encode()
     {
         String encoded = "";
         String encodedArray[] = mInputText.split("");
         String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         for (int i = 0; i<encodedArray.length;i++)
         {
             if (mInputText.charAt(i) == ' ')
             {
                 encoded += " ";
             }
             else
             {
                 int charPosition = alphabet.indexOf(mInputText.charAt(i));
                 int key = (mKey + charPosition) % 26;
                 encoded += alphabet.charAt(key);
             }
         }
         return encoded.toUpperCase();
     }`
     
  Decryption code:
  
  ` public Decrypt(int key, String inputText) {
               mKey = key;
               mInputText = inputText;
           }
           public String getInputText() {
               return mInputText;
           }
           public int getKey() {
               return mKey;
           }`
## Features
This application is able to: 
* Get user input
* Encrypt the text to cipher
* Decrypt the cipher to original string

## Known Bugs
Project is: `Status`
* The Quit option `3` in the Selection choice is not working effectively

## Reference
credits:
*  Ceaser Cipher

## Author
Created by Vincent K. Kogei Email: `vincentkogei@gmail.com`

## License
[MIT LICENCE](license)
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
* Clone the repository
* Open the IDE in the created directory
## Code Examples
Encryption code:

`public  String startEncryption(){
         StringBuilder encrypted= new StringBuilder();
         for(int i=0;i<sentence.length();i++) {
             int c=sentence.charAt(i);
             if(Character.isUpperCase(c)) {
                 c = c + (theKey % 26);
                 if( c> 'Z') c = c-26;
             }
             else if(Character.isLowerCase(c)) {
                 c = c + (theKey % 26);
                 if(c > 'z') c = c - 26;
             }
             encrypted.append((char) c);
         }
         return encrypted.toString();`

## Features
This application is able to: 
* Get user input
* Encrypt the text to cipher
* Decrypt the cipher to original string

## Known Bugs
Project is:  _finished_
* No Bugs

## Inspiration
credits:
1. Ceaser Cipher

## Author
Created by Vincent K. Kogei Email: `vincentkogei@gmail.com`

## License
[MIT LICENCE](license)
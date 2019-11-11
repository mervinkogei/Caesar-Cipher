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

## General info

A user is given a list of options which they are allowed to choose from. If the user selects encryption, they are asked to enter the text to be encrypted and the value thy want the letters to be shifted with. Else, if they select decryption they they are required to either choose between the already encrypted text or enter their own encrypted text. They can exit the program when they select exit option. 


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
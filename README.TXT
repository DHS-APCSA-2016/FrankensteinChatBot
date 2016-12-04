PROJECT TITLE:Frankenstein Chat Bot

PURPOSE OF PROJECT: To create a chatbot

VERSION or DATE: 11/18/16

HOW TO START THIS PROJECT: Currenty doesn't have the runner complete

AUTHORS: Jacob Bratsman & Tim Degerness

Our chatbot is a simulation of Victor Frankenstein (the scientist) who created the monster that we all know and 
love. He responds with quotes from the book and responses that try to emulate his general attitude and behavior.

To start the conversation, start the main task of the frankenstein starter and begin the conversation.
To end the conversation, say "bye" and Victor will stop talking.

Classes
FrankensteinStarter:
	Methods:
	Main
	- Creates the Frankenstein chatbot and gets responses from user and outputs from the Frankenstein class.
Frankenstein:
	Instance Variables:
	keywords
	- Keywords to choose for specialized responses
	responses
	- List of specialized responses
	randomResponses
	- List of random responses

	Methods:
	findKeyword
	- Finds a given keyword from the starting postion desired in a string
	getRandomResponse
	- Generates a random number to choose from the random responses
	tranformIWantToStatement
	- Will transpose a given responce with the phrase I want
	transformYouMeStatement
	- Will transpose a given responce with the phrase you ___ me
	transformIYouStatement
	- Will transpose a given responce with the phrase I ___ you
	transformWhatDoenMeanStatement
	- Will transpose a given responce with the phrase what does ___ mean
	returnResponse
	- Generates the response by looking at the user statement or going to a random responce

Program Highlights
The responses have a hierarchy of set keyword responses, then transposition response, and lastly random responses.
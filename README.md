# curso-javacompletoProj-Dao-JDBC


###### @Author: MaurosMJ
<div style="text-align:center;">
    <img src="https://www.oracle.com/a/ocom/img/jdbc.svg" alt="Descrição da imagem" width="100" height="100">
</div>
This repository contains a project using the standard Java API for database access, JDBC, with the help of Professor Nélio Alves in the course 'Java Complete Object-Oriented Programming + Projects'. As the professor explained and taught, I replicated and implemented the logic in my project and published it here on GitHub to improve my learning.

The goal of this project is to create a system that communicates with a database using the JDBC API. This stage of the course had about 4 hours of video lessons; however, it took me around 7 hours to complete due to the need to perform tests, review code, fix implementation errors, and sometimes rewatch the videos for better understanding.

DOCS:
https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/
https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html
Packages: java.sql and javax.sql (supplementary API for servers)

Technologies:

DBMS Tool: MySQL Workbench
JDBC Connector: MySQL Java Connector
IDE: Eclipse

##### More information:
Course Link: [Link](https://www.udemy.com/course/java-curso-completo)  
Section 21. Project: Database access with JDBC

## Index

- [Architecture](#architecture-1)
- [Worknotes & Commits](#Worknotes&Commits)
- [Credits](#Credits)

## Architecture:

Examples:

### Possible Moves of a Piece:  

<div style="text-align:center;">
    <img src="https://imgur.com/Y5AdB7B.png" alt="Descrição da imagem">
</div>
<div style="text-align:center;">
    <img src="https://imgur.com/zTYAQtB.png" alt="Descrição da imagem">
</div>

### Castling:  

<div style="text-align:center;">
    <img src="https://imgur.com/SU0Z8tk.png" alt="Descrição da imagem">
</div>

### En Passant:  

<div style="text-align:center;">
    <img src="https://imgur.com/ajR1Rgv.png" alt="Descrição da imagem">
</div>

### Promotion:
<div style="text-align:center;">
    <img src="https://imgur.com/EL8UuIi.png" alt="Descrição da imagem">
</div>

## Worknotes & Commits:

##### Worknote #1 - First Class Position
Commit hash: [f70b44743aa81591d9a16cf8627ddc8ac040d1fa](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/f70b44743aa81591d9a16cf8627ddc8ac040d1fa)  
Checklist:
* Class Position [public]
* OOP Topics:
* Encapsulation
* Constructors
* ToString (Object / overriding)

##### Worknote #2 - Starting to implement Board and Piece
Commit hash: [5b00bb0e9d4aa82676cc80d8bec2d71c7fe1945d](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/5b00bb0e9d4aa82676cc80d8bec2d71c7fe1945d)  
Checklist:
* Classes Piece, Board [public]
* OOP Topics:
* Associations
* Encapsulation / Access Modifiers
* Data Structures Topics:
* Matrix

##### Worknote #3 - Chess layer and printing the board
Commit hash: [5d057d827a344dc7400dfd6cfa20df13c809db63](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/5d057d827a344dc7400dfd6cfa20df13c809db63)  
Checklist:
* Classes Piece, Board [public]
* OOP Topics:
* Associations
* Encapsulation / Access Modifiers
* Data Structures Topics:
* Matrix

##### Worknote #4 - Placing pieces on the board
Commit hash: [0d1c4a1bcaa8bda05074481e90b0d7f5efcc6cd3](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/0d1c4a1bcaa8bda05074481e90b0d7f5efcc6cd3)  
Checklist:
* Method: Board.PlacePiece(piece, position)
* Classes: Rook, King [public]
* Method: ChessMatch.InitialSetup
* OOP Topics:
* Inheritance
* Overriding
* Polymorphism (ToString)

##### Worknote #5 - BoardException and defensive programming
Commit hash: [d8a7657012d39672d32df4e34fad24d89e2abea4](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/d8a7657012d39672d32df4e34fad24d89e2abea4)  
Checklist:
* Class BoardException [public]
* Methods: Board.PositionExists, Board.ThereIsAPiece
* Implement defensive programming in Board methods
* OOP Topics:
* Exceptions
* Constructors (a string must be informed to the exception)

##### Worknote #6 - ChessException and ChessPosition
Commit hash: [6c13881057b0055ddb4a49a00d12f2c99c03db39](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/6c13881057b0055ddb4a49a00d12f2c99c03db39)  
Checklist:
* Class ChessException [public]
* Class ChessPosition [public]
* Refactor ChessMatch.InitialSetup
* OOP Topics:
* Exceptions
* Encapsulation
* Constructors (a string must be informed to the exception)
* Overriding
* Static members
* Layers pattern

##### Worknote #7 - Little improvement in board printing
Commit hash: [7f9d1202e6ce32a1d4c7b9f6c3c53c1280b84d4f](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/7f9d1202e6ce32a1d4c7b9f6c3c53c1280b84d4f)  
Checklist:
* Color in terminal:
* Windows: Git Bash
* Mac: Google "osx terminal color"

Checklist:
* Place more pieces on the board
* Distinguish piece colors in UI.PrintPiece method

##### Worknote #8 - Moving pieces
Commit hash: [a6d024ee0a9e8b91637362d9b909cb4e1236ea5e](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/a6d024ee0a9e8b91637362d9b909cb4e1236ea5e)  
Checklist:
* Method Board.RemovePiece
* Method UI.ReadChessPosition
* Method ChessMatch.PerformChessMove
* Method ChessMatch.MakeMove
* Method ChessMatch.ValidadeSourcePosition
* Write basic logic on Program.cs
* OOP Topics:
* Exceptions
* Encapsulation

##### Worknote #9 - Handling exceptions and clearing screen
Commit hash: [bde6e416f7a8fc49e544168efd848767fe99dd55](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/bde6e416f7a8fc49e544168efd848767fe99dd55)  
Checklist:
* ChessException
* InputMismatchException

##### Worknote #10 - Possible moves of a piece
Commit hash: [20096e534e191ed0c206a6da0e5b52b92597db37](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/20096e534e191ed0c206a6da0e5b52b92597db37)  
Checklist:
* Methods in Piece:
* PossibleMoves [abstract]
* PossibleMove
* IsThereAnyPossibleMove
* Basic PossibleMove implementation for Rook and King
* Update ChessMatch.ValidadeSourcePosition
* OOP Topics:
* Abstract method / class
* Exceptions

##### Worknote #11 - Implementing possible moves of Rook
Commit hash: [1dfccd937e7183cbdb11deef5af3225a24796cbb](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/1dfccd937e7183cbdb11deef5af3225a24796cbb)  
Checklist:
* Method ChessPiece.IsThereOpponentPiece(position) [protected]
* Implement Rook.PossibleMoves
* Method ChessMatch.ValidateTargetPosition
* OOP Topics:
* Polymorphism
* Encapsulation / access modifiers [protected]
* Exceptions

##### Worknote #12 - Printing possible moves
Commit hash: [bd2f4447cea6e40af6739d4c35aa5cea1da520ba](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/bd2f4447cea6e40af6739d4c35aa5cea1da520ba)  
Checklist:
* Method ChessMatch.PossibleMoves
* Method UI.PrintBoard [overload]
* Refactor main program logic
* OOP Topics:
* Overloading

##### Worknote #13 - Implementing possible moves of King
Commit hash: [ca678564d911f4a12907b6e4759998658bbd249b](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/ca678564d911f4a12907b6e4759998658bbd249b)  
Checklist:
* Method King.CanMove(position) [private]
* Implement King.PossibleMoves
* OOP Topics:
* Encapsulation
* Polymorphism

##### Worknote #14- Switching player each turn
Commit hash: [185eb7af0e3186016cd4cd091ea0b0d4bed04417](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/185eb7af0e3186016cd4cd091ea0b0d4bed04417)  
Checklist:
* Class ChessMatch:
* Properties Turn, CurrentPlayer [private set]
* Method NextTurn [private]
* Update PerformChessMove
* Update ValidadeSourcePosition
* Method UI.PrintMatch
* OOP Topics:
* Encapsulation
* Exceptions

##### Worknote #15 - Handling captured pieces
Commit hash: [d096a70d4a752ddcdce1c49bb280b3526226be18](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/d096a70d4a752ddcdce1c49bb280b3526226be18)  
Checklist:
* Method UI.PrintCapturedPieces
* Update UI.PrintMatch
* Update Program logic
* Lists in ChessMatch: _piecesOnTheBoard, _capturedPieces
* Update constructor
* Update PlaceNewPiece
* Update MakeMove
* OOP Topics:
* Encapsulation
* Constructors
* Data Structures Topics:
* List

##### Worknote #16 - Check logic
Commit hash: [1660c7e0ae73a7209e1f8d7718eac83ad11a4d1d](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/1660c7e0ae73a7209e1f8d7718eac83ad11a4d1d)  
Rules:
* Check means your king is under threat by at least one opponent piece
* You can't put yourself in check

Checklist:
* Property ChessPiece.ChessPosition [get]
* Class ChessMatch:
* Method UndoMove
* Property Check [private set]
* Method Opponent [private]
* Method King(color) [private]
* Method TestCheck
* Update PerformChessMove
* Update UI.PrintMatch

##### Worknote #17 - Checkmate logic
Commit hash: [1660c7e0ae73a7209e1f8d7718eac83ad11a4d1d](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/1660c7e0ae73a7209e1f8d7718eac83ad11a4d1d)  
Checklist:
* Class ChessMatch:
* Property Checkmate [private set]
* Method TestCheckmate [private]
* Update PerformChessMove
* Update UI.PrintMatch
* Update Program logic

##### Worknote #18 - Piece move count
Commit hash: [c5427cb3b76310b650b7671758576ba19641c46e](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/c5427cb3b76310b650b7671758576ba19641c46e)  
Checklist:
* Class ChessPiece:
* Property MoveCount [private set]
* Method IncreaseMoveCount [internal]
* Method DecreaseMoveCount [internal]
* Class ChessMatch:
* Update MakeMove
* Update UndoMove
* OOP Topics:
* Encapsulation

##### Worknote #19 - Pawn
Commit hash: [11432d0f6d2544aba15d4b8394069f3ac2aca8a9](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/11432d0f6d2544aba15d4b8394069f3ac2aca8a9)  
Checklist:
* Class Pawn
* Update ChessMatch.InitialSetup
* OOP Topics:
* Encapsulation
* Inheritance
* Polymorphism

##### Worknote #20 - Bishop
Commit hash: [1e17373971fc627ce674b407213cb33e3ae7dac3](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/1e17373971fc627ce674b407213cb33e3ae7dac3)  
Checklist:
* Class Bishop
* Update ChessMatch.InitialSetup
* OOP Topics:
* Encapsulation
* Inheritance
* Polymorphism

##### Worknote #21 - Knight
Commit hash: [df1edadd3b1841e94a23884ab898383c2823b25c](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/df1edadd3b1841e94a23884ab898383c2823b25c)  
Checklist:
* Class Knight
* Update ChessMatch.InitialSetup
* OOP Topics:
* Encapsulation
* Inheritance
* Polymorphism

##### Worknote #22 - Queen
Commit hash: [100daa2ea721f74f0fe72207a0c08d26a4e73e88](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/100daa2ea721f74f0fe72207a0c08d26a4e73e88)  
Checklist:
* Class Queen
* Update ChessMatch.InitialSetup
* OOP Topics:
* Encapsulation
* Inheritance
* Polymorphism

# Special Moves

##### Worknote #23 - Castling
Commit hash: [258d28376305b6dc32e224d796043b131a853818](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/258d28376305b6dc32e224d796043b131a853818)  
Checklist:
* Update King
* Update ChessMatch.MakeMove
* Update ChessMatch.UndoMove

##### Worknote #24 - En Passant
Commit hash: [9b873ae7f596e179b2e752605d00db93055ac60a](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/9b873ae7f596e179b2e752605d00db93055ac60a)  
Checklist:
* Register a pawn which can be captured by en passant on next turn
* Property ChessMatch.EnPassantVulnerable
* Update ChessMatch.PerformChessMove
* Update Pawn.PossibleMoves
* Update ChessMatch.MakeMove
* Update ChessMatch.UndoMove
* Update ChessMatch.InitialSetup

##### Worknote #25 - Promotion
Commit hash: [be95d0991af4cdc5a41bfe0cedc64c9e208a9175](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/be95d0991af4cdc5a41bfe0cedc64c9e208a9175)  
Checklist:
* Property ChessMatch.Promoted
* Update ChessMatch.PerformChessMove
* Method ChessMatch.ReplacePromotedPiece
* Update Program logic

# Credits:
[@acenelio (Nelio Alves)](https://github.com/acenelio)  
[@Me :)](https://github.com/MaurosMJ)

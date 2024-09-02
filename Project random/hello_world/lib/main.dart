import 'dart:html';

import 'package:flutter/material.dart';

void main () {
  runApp(MyWidget());
}

class MyWidget extends StatefulWidget {
  const MyWidget({super.key});

  @override
  State<MyWidget> createState() => _MyWidgetState();
}

class _MyWidgetState extends State<MyWidget> {
    bool isPressed = false;
    bool isPressed1 = false;

    void _testisPresed(){
      setState(() {
        isPressed =! isPressed;
        isPressed1 = false;
      });
    }

      void _testisPresed1(){
        setState(() {
          isPressed1 =! isPressed1;
          isPressed = false;
        });
      }
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        body: Column(
          children: [
          InkWell(
            onTap: (){
                _testisPresed();
            },
            child:
              Container(
                width: 100,
                height: 100,
                color:isPressed ? Colors.yellow : Colors.red,
            
              ),
          ),
              const SizedBox(height: 20,),
              InkWell(
                onTap: (){
                  _testisPresed1();
                } ,
                child: Container(
                  width: 100,
                  height: 100,
                  color:isPressed1 ? Colors.yellow : Colors.red,
                ),
              )



                  ]),
      ),
    );
  }
}


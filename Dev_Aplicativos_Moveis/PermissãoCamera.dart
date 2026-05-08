import 'package:flutter/material.dart';
import 'package:permission_handler/permission_handler.dart';

void main() {
  runApp(const MainApp());
}

class MainApp extends StatelessWidget {
  const MainApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: PermissionPage(),
    );
  }
}

class PermissionPage extends StatefulWidget {
  @override
  State<PermissionPage> createState() => _PermissionPageState();
}

class _PermissionPageState extends State<PermissionPage> {

  String mensagem = "Clique no botão";

  Future<void> pedirPermissao() async {

    PermissionStatus status = await Permission.camera.request();

    setState(() {

      if (status.isGranted) {
        mensagem = "✅ Valeu Fera";
      }

      else if (status.isDenied) {
        mensagem = "❌ Faio vi Nego";
      }

      else {
        mensagem = "⚠️ O negocio não funciona não";
      }

    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(

      appBar: AppBar(
        title: const Text("Permissão da Câmera"),
      ),

      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [

            Text(
              mensagem,
              style: const TextStyle(fontSize: 22),
            ),

            const SizedBox(height: 20),

            ElevatedButton(
              onPressed: pedirPermissao,
              child: const Text("Solicita ai"),
            )

          ],
        ),
      ),
    );
  }
}

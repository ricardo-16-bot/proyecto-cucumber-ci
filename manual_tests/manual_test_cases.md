Estrategia de Pruebas Manuales - Aplicación Web (the-internet.herokuapp.com)

   1. Introducción

   Objetivo: Este documento describe la estrategia de pruebas manuales adoptada para validar funcionalidades clave de la aplicación web [https://the-internet.herokuapp.com/](https://the-internet.herokuapp.com/). El objetivo principal es asegurar la calidad y funcionalidad de la aplicación a través de la ejecución manual de casos de prueba diseñados para cubrir aspectos críticos de la interacción del usuario.

   2. Alcance de las Pruebas Manuales

   Funcionalidades en Alcance:
        Añadir y eliminar elementos dinámicamente ([https://the-internet.herokuapp.com/add\_remove\_elements/](https://the-internet.herokuapp.com/add_remove_elements/)).
        Verificar la visualización de contenido dinámico ([https://the-internet.herokuapp.com/dynamic\_content](https://the-internet.herokuapp.com/dynamic_content)).
        Verificar la visualización de datos en tablas ([https://the-internet.herokuapp.com/tables](https://the-internet.herokuapp.com/tables)).
        Realizar un intento de inicio de sesión ([https://the-internet.herokuapp.com/login](https://the-internet.herokuapp.com/login)).
   Funcionalidades Fuera de Alcance:
        Cualquier otra funcionalidad no mencionada explícitamente en el alcance.
        Pruebas de rendimiento.
        Pruebas de seguridad automatizadas.

   3. Tipos de Pruebas Manuales

   Pruebas Funcionales Manuales:
        Se realizarán pruebas funcionales manuales para verificar que la aplicación se comporta de acuerdo con los requisitos funcionales desde la perspectiva del usuario. Esto incluye la validación de la interacción con los elementos de la UI, el flujo de la navegación y la correcta respuesta de la aplicación a las acciones del usuario.
   Pruebas de Interfaz de Usuario (UI) Manuales:
        * Se llevarán a cabo pruebas de UI manuales para asegurar que los elementos de la interfaz de usuario (botones, campos de texto, enlaces, etc.) son interactivos, se muestran correctamente y funcionan como se espera.

   4. Técnicas de Pruebas Manuales

   Partición de Equivalencia:
        Se utilizará esta técnica para dividir los datos de entrada (donde aplique) y las acciones del usuario en clases de equivalencia válidas e inválidas. Esto permitirá reducir el número de casos de prueba manuales necesarios al tiempo que se mantiene una buena cobertura de las diferentes situaciones que el usuario podría experimentar.
   Análisis de Valores Límite:
        Se aplicará el análisis de valores límite para probar los valores en los límites de las clases de equivalencia (donde aplique). Por ejemplo, en la prueba de inicio de sesión, se podrían probar los límites de longitud de los campos de nombre de usuario y contraseña (si existieran tales límites).
        
Pruebas de Flujo de Valor Normal:
        Se probarán los flujos de usuario más comunes y esperados con datos válidos y acciones típicas. Por ejemplo, el flujo normal de añadir un elemento y luego eliminarlo.
        
Pruebas de Flujo Alternativo:
        Se probarán flujos de usuario menos comunes o excepcionales, incluyendo casos con datos inválidos (donde aplique) o secuencias de acciones atípicas. Por ejemplo, intentar eliminar un elemento sin haberlo añadido previamente (si el sitio lo permitiera).

5. Niveles de Prueba Manuales

Pruebas de Componente Manuales:

   Se realizarán pruebas de componente manuales para validar la funcionalidad de los elementos individuales de la UI (ej., el botón "Add Element", los campos de inicio de sesión).
        
Pruebas de Integración Manuales:
        Se llevarán a cabo pruebas de integración manuales para verificar la interacción entre diferentes elementos o secciones de la página (ej., la interacción entre el botón "Add Element" y la lista de botones "Delete").
        
Pruebas de Sistema Manuales:
         Se realizarán pruebas de sistema manuales para validar flujos completos de usuario dentro de las funcionalidades en alcance (ej., el flujo completo de inicio de sesión).

   6. Criterios de Aceptación para Pruebas Manuales

   Los criterios de aceptación para cada caso de prueba manual se definirán específicamente en la documentación del caso de prueba. En general, una prueba manual se considera exitosa si:
   
        El usuario puede completar los pasos descritos en el caso de prueba sin encontrar errores o comportamientos inesperados.
        
        Los resultados observados por el probador coinciden con los resultados esperados documentados en el caso de prueba.
        
        La interfaz de usuario se comporta de manera intuitiva y proporciona una experiencia de usuario satisfactoria.

   7. Herramientas de Pruebas Manuales

   Navegador Web (Google Chrome): Se utilizará el navegador Google Chrome para acceder a la aplicación web y ejecutar las pruebas manuales.
   
   Documento de Casos de Prueba (Excel/Markdown):Se utilizará un documento de Excel o Markdown para documentar los casos de prueba manuales y registrar los resultados de la ejecución.

   8. Entorno de Pruebas Manuales

   Las pruebas manuales se ejecutarán en el siguiente entorno:
        * Navegador: Google Chrome (versión más reciente)
        * Sistema Operativo: (Ejemplo) Windows 10
        * Resolución de Pantalla: (Ejemplo) 1920x1080
        * Conexión a Internet estable.

   9. Roles y Responsabilidades en Pruebas Manuales

   Analista de Pruebas Manuales:
   
        * Responsable de diseñar, documentar y ejecutar los casos de prueba manuales.
        
        * Responsable de registrar los resultados de las pruebas manuales y documentar cualquier incidencia o desviación de los resultados esperados.
        
        * Comunicar cualquier problema o hallazgo relevante al equipo de desarrollo o al responsable del proyecto.

   10. Proceso de Gestión de Incidencias en Pruebas Manuales

   Cualquier incidencia o desviación de los resultados esperados encontrada durante la ejecución de las pruebas manuales se registrará en un documento o sistema de seguimiento de incidencias (si se dispone de él).
   
   La incidencia se documentará con la mayor claridad y detalle posible, incluyendo los pasos para reproducirla, los resultados observados y los resultados esperados.
   
   Las incidencias se priorizarán según su gravedad e impacto y se comunicarán al equipo de desarrollo para su análisis y resolución.

   11. Riesgos y Supuestos en Pruebas Manuales

   Riesgos:
   
         Falta de claridad o cambios en los requisitos que puedan requerir la revisión y actualización de los casos de prueba manuales.
         
        Limitaciones de tiempo que puedan afectar la cobertura de las pruebas manuales.
        
        Dependencia de la disponibilidad y estabilidad del entorno de pruebas.
        
   Supuestos:
   
        Se asume que la aplicación web es accesible y funcional en el entorno de pruebas especificado.
        
        Se asume que los probadores manuales tienen un conocimiento adecuado de la aplicación web y de las técnicas de pruebas manuales.

   12. Aprobación

   Esta estrategia de pruebas manuales ha sido revisada y aprobada por:
         (Ejemplo) Nombre del Responsable de QA
         (Ejemplo) Fecha de Aprobación

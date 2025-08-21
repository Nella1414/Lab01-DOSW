# Laboratorio 1 DOSW

## Integrantes: Marianella Polo y Carlos Piedrahita
## Grupo 3

# DOSW (Parte I: Trabajo Individual)


Checklist de actividades (confirmadas):

- Crear repositorio local — Hecho.
- Agregar un archivo de ejemplo al repositorio (este `README.md`) — Hecho.
- Investigar el uso de `git add` y `git commit -m "mensaje"` — Hecho.
- Abrir una cuenta de GitHub y enlazar el correo institucional — Hecho.
- Crear un repositorio vacío en GitHub — Hecho.
- Configurar el repositorio local con el repositorio remoto — Hecho.
- Subir los cambios usando los comandos indicados (`git add .`, `git commit -m "mensaje"`, `git push "url repositorio"`) — Hecho.
- Configurar el correo en Git local correctamente — Hecho.
- Volver a subir los cambios y verificar en GitHub — Hecho.

Nota: Este archivo solo registra que las tareas fueron realizadas. Para ver evidencia (commits, remotos, configuración de correo), revisa el historial de `git`, el repositorio remoto en GitHub y el documento Word.

---

Archivo creado/actualizado por el Nella.

## Parte 1
1.	Crea un repositorio localmente.
2.	Agrega un archivo de ejemplo al repositorio, el README.md puede ser una gran opción.
 
3.	Averigua para qué sirve y como se usan estos comandos git add y git commit -m “mensaje”.
El comando git add se utiliza para añadir los cambios realizados en los archivos a la zona de preparación (staging area) en el repositorio local de Git. Una vez que los cambios están listos, se ejecuta git commit -m "mensaje", lo cual guarda esos cambios de forma definitiva en el repositorio, acompañado de un mensaje que describe lo que se ha modificado. Esto permite llevar un registro claro de las actualizaciones realizadas a lo largo del tiempo.
 
4.	Abre una cuenta de github, si ya la tienes, enlazala con el correo institucional.
5.	Crea un repositorio en blanco (vacío) e GitHub.
6.	Configura el repositorio local con el repositorio remoto.
7.	Sube los cambios, teniendo en cuenta lo que averiguaste en el punto 3 Utiliza los siguientes comandos en el directorio donde tienes tu proyecto, en este orden:
a.	  git add .
 
b.	  git commit -m "mensaje, lo que hiciste con el archivo"
 
c.	  git push "url repositorio"
 
8.	Configura el correo en git local de manera correcta.
 
9.	Vuelve a subir los cambios y observa que todo esté bien en el repositorio remoto (en GitHub).
## Parte 2
1.	Se escogen los roles para trabajar en equipo, una persona debe escoger ser "Owner" o Propietario del repositorio y la otra "Collaborator" o Colaborador en el repositorio. 
2.	El owner le comparte la url via Teams al colaborador	
3.	El colaborador acepta la invitación al repositorio
4.	Owner y Colaborador editan el archivo README.md al mismo tiempo e intentan subir los cambios al mismo tiempo.
5.	¿Qué sucedió?
Apareció un conflicto entre los archivos debido a que al editar el mismo e intentar subir los cambios sobre el mismo archivo solo toma el primero subido al repositorio online.
6.	La persona que perdió la competencia de subir los cambios tiene que resolver los conflictos, cuando haces pull de los cambios, los archivos tienen los símbolos <<< === y >>> (son normales en la resolución de conflictos), estos conflictos debes resolverlos manualmente.
7.	Repetir un cambio sobre el README.md ambas personas al tiempo para volver a tener conflictos.

8.	Resuelvan el conflicto con IntelliJ si es posible.
Otra manera de resolver el conflicto es haciendo uso del comando git reset –hard para eliminar los cambios que yo realice y dejar el repositorio en el estado del último pull que hice.

## Parte 3
1.	¿Hay una mejor forma de trabajar con git para no tener conflictos?
Si, hay mejores prácticas para trabajar en Git y no tener conflictos, como con el uso de ramas o branches, que permiten que cada desarrollador trabaje en su propio entorno sin afectar directamente la rama principal (main). Además, es recomendable utilizar pull requests para solicitar la integración de los cambios. De esta manera, el propietario del repositorio (o un responsable designado) puede revisar y aprobar los cambios antes de fusionarlos a la rama principal.

Y en equipos pequeños, como de dos personas, también es muy importante mantener una comunicación asertiva. Si trabajan en distintos horarios, es útil coordinarse para evitar que ambos modifiquen los mismos archivos al mismo tiempo, lo cual reduce significativamente las posibilidades de conflictos.

2.	¿Qué es y cómo funciona el Pull Request?
Un Pull Request es una herramienta que ofrece Git para solicitar la integración en la rama principal o main de los cambios realizados en una rama. Funciona como una solicitud de revisión, donde otros desarrolladores pueden comentar, sugerir cambios y aprobar antes de que el código se fusione oficialmente.

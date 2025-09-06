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
- Subir los cambios usando los comandos indicados (`git add .`, `git commit -m "mensaje"`, `git push -u origin main`) — Hecho.
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
 
4.	Abre una cuenta de GitHub; si ya la tienes, enlázala con el correo institucional.
5.	Crea un repositorio en blanco (vacío) en GitHub.
6.	Configura el repositorio local con el repositorio remoto.
7.	Sube los cambios, teniendo en cuenta lo que averiguaste en el punto 3. Utiliza los siguientes comandos en el directorio donde tienes tu proyecto, en este orden:
a.	  git add .

b.	  git commit -m "mensaje, lo que hiciste con el archivo"

c.	  git push -u origin main

Nota: En el primer push es buena práctica usar -u (o --set-upstream) para establecer la rama remota por defecto. Si tu rama local tiene otro nombre, reemplaza main por el nombre de la rama (por ejemplo: git push -u origin mi-rama) o usa git push origin main para un push sin establecer upstream.
 
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
Otra manera de resolver el conflicto es haciendo uso del comando `git reset --hard` para eliminar los cambios que yo realicé y dejar el repositorio en el estado del último pull que hice.

> ⚠️ Advertencia: El comando `git reset --hard` eliminará todos los cambios no confirmados (uncommitted changes) de forma permanente. Asegúrate de que no necesitas esos cambios antes de ejecutarlo, ya que no se pueden recuperar.


## Parte 3
1.	¿Hay una mejor forma de trabajar con git para no tener conflictos?
Si, hay mejores prácticas para trabajar en Git y no tener conflictos, como con el uso de ramas o branches, que permiten que cada desarrollador trabaje en su propio entorno sin afectar directamente la rama principal (main). Además, es recomendable utilizar pull requests para solicitar la integración de los cambios. De esta manera, el propietario del repositorio (o un responsable designado) puede revisar y aprobar los cambios antes de fusionarlos a la rama principal.

Y en equipos pequeños, como de dos personas, también es muy importante mantener una comunicación asertiva. Si trabajan en distintos horarios, es útil coordinarse para evitar que ambos modifiquen los mismos archivos al mismo tiempo, lo cual reduce significativamente las posibilidades de conflictos.

2.	¿Qué es y cómo funciona el Pull Request?
Un Pull Request es una herramienta que ofrece Git para solicitar la integración en la rama principal o main de los cambios realizados en una rama. Funciona como una solicitud de revisión, donde otros desarrolladores pueden comentar, sugerir cambios y aprobar antes de que el código se fusione oficialmente.

# Parte 2 Laboratorio

## Parte 2
Agregar imagenes

## Parte 3

#### 1. ¿Cuál es la diferencia entre git merge y git rebase?
merge combina el historial de dos ramas creando un nuevo commit de unión.

rebase reescribe el historial colocando los commits de una rama encima de otra, manteniendo la línea más limpia.

#### 2. Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer merge?
Se produce un conflicto y Git pide al usuario que lo resuelva manualmente antes de continuar.

#### 3. ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?
Con:
```
git log --graph --oneline --all
```

#### 4. Explica la diferencia entre un commit y un push.

commit: guarda cambios localmente en tu repositorio.

push: envía esos commits al repositorio remoto (ej. GitHub).

#### 5. ¿Para qué sirve git stash y git pop?

stash: guarda cambios temporales sin hacer commit.

pop: recupera esos cambios guardados y los aplica de nuevo.

#### 6. ¿Qué diferencia hay entre HashMap y Hashtable?

HashMap: no es sincronizado, más rápido, puede tener una clave `null`.

Hashtable: es sincronizado (seguro para hilos), más lento, no acepta claves `null`.

#### 7. ¿Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa?
Permite construir mapas de forma más declarativa y concisa usando streams, con mejor legibilidad y flexibilidad (manejo de duplicados, transformaciones, etc.).

#### 8. Si usas List con objetos y luego aplicas stream().map(), ¿qué tipo de operación estás haciendo?
Una transformación: conviertes cada elemento en otro valor u objeto y obtienes un nuevo stream.

#### 9. ¿Qué hace el método stream().filter() y qué retorna?
Filtra elementos según una condición (predicado) y retorna un nuevo stream solo con los que cumplen la condición.

#### 10. Describe el paso a paso de cómo crear una rama desde develop si es una funcionalidad nueva.

Estar en develop: ``` git checkout develop.```

Actualizar: ```git pull origin develop.```

Crear rama: ```git checkout -b feature/nueva_funcionalidad.```

Subir rama: ```git push origin feature/nueva_funcionalidad.```

#### 11. ¿Cuál es la diferencia entre crear una rama con git branch y con git checkout -b?

git branch nombre: solo crea la rama, no te mueve a ella.

git checkout -b nombre: crea la rama y además te cambia a esa rama.

#### 12. ¿Por qué es recomendable crear ramas feature/ para nuevas funcionalidades en lugar de trabajar en main directamente?
Porque permite trabajar de forma segura y aislada, evitando dañar el código estable en main y facilitando revisiones y control de versiones.
# Fitness Club (Maven WAR)

This is a minimal two-page web app example implemented with Java Servlets and packaged as a WAR using Maven.

- Home: `GET /` or `GET /home` (served by `HomeServlet`)
- Clubs: `GET /club` (served by `ClubServlet`)

Build & run locally (needs Java and Maven installed):

```powershell
cd c:\Users\Student\Desktop\fitness-club
mvn -v
mvn -B package
# Run locally with embedded Jetty
mvn jetty:run
```

To push to GitHub (replace with your repo URL):

```powershell
git add .
git commit -m "Add Maven webapp scaffold"
git remote add origin https://github.com/<your-username>/<repo>.git
git push -u origin main
```

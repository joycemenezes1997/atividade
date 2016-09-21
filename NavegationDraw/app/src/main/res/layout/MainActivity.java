@SuppressWarnings("StatementWithEmptyBody")
@Override
public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_solucoes) {
        } else if (id == R.id.nav_servicos) {

        } else if (id == R.id.nav_empresa) {

        } else if (id == R.id.nav_carreira) {

        } else if (id == R.id.nav_blog) {

        } else if (id == R.id.nav_webinars) {

        } else if (id == R.id.nav_contato) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
        }
        }

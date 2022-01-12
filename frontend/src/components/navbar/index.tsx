
import {ReactComponent as IconGit} from 'assets/img/github.svg';
import './styles.css';

  function NavBar(){

    return(

        <header>
        <nav className="container">
          <div className="dsmovie-nav-content">
            <h1>Ds Movie</h1>
            <a href="https://github.com/DiegoCardosoDev">
                
              <div className="dsmovi-contact-container">
                <IconGit/>
                <p className="dsmovie-contact-link">/DiegoCardosoDev </p>
              </div>
      
            </a>
          </div>
        </nav>
      </header>

    );

}

export default NavBar;


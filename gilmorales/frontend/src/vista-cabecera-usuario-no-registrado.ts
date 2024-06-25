import { LitElement, html, css, customElement } from 'lit-element';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-cabecera-usuario-no-registrado')
export class VistaCabeceraUsuarioNoRegistrado extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

 render() {
    return html`
<vaadin-vertical-layout id="cabeceraNR" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout id="cabecera" style="justify-content: space-evenly; position: fixed; width: 100%; z-index:999; background-color: #423F3F; height: 8%; align-items: center; margin: 0%; padding: 0%; display: flex;">
  <vaadin-button theme="icon" aria-label="Add new" id="logoWeb" style="flex-grow: 0; background-color: transparent; margin-right: 10%; max-width: 3%; max-height: 100%; align-self: center;">
   <iron-icon id="iconoWeb" style="width: 1px; height: 1px;"></iron-icon>
  </vaadin-button>
  <vaadin-horizontal-layout id="barraBusqueda" style="flex-grow: 0; flex-shrink: 0; width: 30%; margin-right: 5%;" theme="spacing">
   <vaadin-text-field placeholder="Search" id="textoBusqueda" style="flex-grow: 1; margin: 0%; align-self: center; padding: 0px; background-color: #FFFFFF; flex-shrink: 0;" clear-button-visible>
    <iron-icon icon="lumo:search" slot="prefix" id="ironIcon"></iron-icon>
   </vaadin-text-field>
   <vaadin-button theme="icon" aria-label="Add new" id="botonBuscar">
    <iron-icon icon="lumo:search" style="background-color: transparent; color: #fffff; font-size: 40px; color: white;"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-button id="inicio" style="background-color: #ffff; broder-radius: 8px;">
    Inicio 
  </vaadin-button>
  <vaadin-button id="vaadinButton">
    Iniciar Sesión 
  </vaadin-button>
  <vaadin-button id="botonRegistrarse" style="background-color: #ffff; broder-radius: 8px;">
    Registrarse 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 100%; height: 100%; max-height: 92%; margin-top: 5%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}

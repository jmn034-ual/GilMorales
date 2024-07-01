import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-cabecera-admin')
export class VistaCabeceraAdmin extends LitElement {
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
<vaadin-vertical-layout style="width: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout id="cabecera" style="justify-content: space-evenly; position: fixed; width: 100%; z-index:999; background-color: #423F3F; height: 8%; align-items: center; margin: 0%; padding: 0%; display: flex;">
  <vaadin-button theme="icon" aria-label="Add new" id="logoWeb" style="flex-grow: 0; background-color: transparent; margin-right: 10%; max-width: 3%; max-height: 100%; align-self: center;">
   <iron-icon icon="lumo:plus" id="iconoWeb"></iron-icon>
  </vaadin-button>
  <vaadin-horizontal-layout id="barraBusqueda" style="justify-content: flex-start; flex-grow: 0; flex-shrink: 0; width: 35%;">
   <vaadin-text-field placeholder="Search" id="textoBusqueda" style="flex-grow: 0; width: 80%; margin: 0%; align-self: stretch; background: white;">
    <iron-icon icon="lumo:search" slot="prefix" id="ironIcon"></iron-icon>
   </vaadin-text-field>
   <vaadin-button theme="icon" aria-label="Add new" id="botonBuscar">
    <iron-icon icon="lumo:search" style="background-color: transparent; color: #fffff; font-size: 40px; color: white;"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-button id="inicio" style="background-color: #ffff; broder-radius: 8px;">
    Inicio 
  </vaadin-button>
  <vaadin-button id="gestionarDenunciasB" style=" broder-radius: 8px;" theme="primary">
    Gestionar denuncias 
  </vaadin-button>
  <vaadin-button id="cerrarSesionB" style="background-color: #ffff; broder-radius: 8px;" theme="error">
    Cerrar sesión 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}

import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-cabecera')
export class VistaCabecera extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout id="cabecera" style="justify-content: space-evenly; position: fixed; width: 100%; z-index:999; background-color: #423F3F; height: 8%; align-items: center; margin: 0%; padding: 0%; display: flex;">
  <vaadin-button theme="icon" aria-label="Add new" id="logoWeb" style="flex-grow: 0; background-color: transparent; margin-right: 10%; max-width: 3%; max-height: 100%; align-self: center;">
   <iron-icon id="iconoWeb"></iron-icon>
  </vaadin-button>
  <vaadin-horizontal-layout id="barraBusqueda" style="justify-content: flex-start; flex-grow: 0; flex-shrink: 0; width: 35%;">
   <vaadin-text-field placeholder="Search" id="textoBusqueda" style="flex-grow: 0; width: 80%; margin: 0%; align-self: stretch; background: white;">
    <iron-icon icon="lumo:search" slot="prefix" id="ironIcon"></iron-icon>
   </vaadin-text-field>
   <vaadin-button theme="icon" aria-label="Add new" id="botonBuscar" style="background-color: transparent; flex-shrink: 1;">
    <iron-icon icon="lumo:search" style="background-color: transparent; color: #fffff; font-size: 40px; color: white;"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-button id="inicio" style="background-color: #ffff; broder-radius: 8px;">
    Inicio 
  </vaadin-button>
  <vaadin-button id="botonAniadir">
   <iron-icon icon="lumo:plus" slot="suffix"></iron-icon>Añadir 
  </vaadin-button>
  <vaadin-button theme="icon" aria-label="Add new" id="botonNotificaciones">
   <iron-icon icon="lumo:bell" style="font-size: 250%; color: white;"></iron-icon>
  </vaadin-button>
  <vaadin-button theme="icon" aria-label="Add new" id="botonPerfil">
   <iron-icon icon="lumo:user" style="font-size: 250%; color: white;"></iron-icon>
  </vaadin-button>
  <vaadin-button id="botonCerrarSesion" style="background-color: #ffff; broder-radius: 8px;">
    Cerrar Sesión 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 100%; margin-top: 5%; max-height: 92%; flex-grow: 0; flex-shrink: 0; align-items: center; overflow-y: auto; z-index: 999; height: 100%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}

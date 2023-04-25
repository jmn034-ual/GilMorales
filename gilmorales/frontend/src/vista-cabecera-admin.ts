import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout id="cabecera" style="align-self: stretch; justify-content: space-around; width: 100%;">
  <vaadin-button theme="icon" aria-label="Add new" id="logoWeb" style="flex-grow: 0;">
   <iron-icon icon="lumo:plus" id="iconoWeb"></iron-icon>
  </vaadin-button>
  <vaadin-horizontal-layout id="barraBusqueda" style="justify-content: flex-start; flex-grow: 0; flex-shrink: 0; width: 35%;">
   <vaadin-text-field placeholder="Search" id="textoBusqueda" style="flex-grow: 0; width: 80%;">
    <iron-icon icon="lumo:search" slot="prefix" id="ironIcon"></iron-icon>
   </vaadin-text-field>
   <vaadin-button id="botonBuscar" style="flex-grow: 1;">
     Buscar 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-button id="inicio">
    Inicio 
  </vaadin-button>
  <vaadin-button id="gestionarDenunciasB">
    Gestionar denuncias 
  </vaadin-button>
  <vaadin-button id="cerrarSesionB">
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
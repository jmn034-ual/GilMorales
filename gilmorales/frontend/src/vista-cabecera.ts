import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

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
 <vaadin-horizontal-layout id="cabecera" style="align-self: stretch; justify-content: space-around;">
  <vaadin-button theme="icon" aria-label="Add new" id="logoWeb" style="flex-grow: 0;">
   <iron-icon icon="lumo:plus"></iron-icon>
  </vaadin-button>
  <vaadin-horizontal-layout id="barraBusqueda" style="justify-content: flex-start; flex-grow: 0; flex-shrink: 0; width: 35%;">
   <vaadin-text-field placeholder="Search" id="textoBusqueda" style="flex-grow: 0; width: 80%;">
    <iron-icon icon="lumo:search" slot="prefix" id="ironIcon"></iron-icon>
   </vaadin-text-field>
   <vaadin-button id="botonBuscar">
    Buscar
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-button id="inicio">
   Inicio
  </vaadin-button>
  <vaadin-button id="botonNotificaciones">
   Notificaciones
  </vaadin-button>
  <vaadin-button id="botonAniadir">
   Añadir
  </vaadin-button>
  <vaadin-button id="botonPerfil">
   Perfil
  </vaadin-button>
  <vaadin-button id="botonCerrarSesion">
   Cerrar Sesión
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

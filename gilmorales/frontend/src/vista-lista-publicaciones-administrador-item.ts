import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-lista-publicaciones-administrador-item')
export class VistaListaPublicacionesAdministradorItem extends LitElement {
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
<vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 10%;">
   <div id="foto" style="width: 100%; height: 100%;">
     Div 
   </div>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 70%;">
   <vaadin-button theme="tertiary" id="nombre">
    nombre de usuario
   </vaadin-button>
   <label id="geolocalizacion" style="align-self: flex-start;">Geolocalizacion</label>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="align-self: center;">
   <vaadin-button id="eliminarPub">
    Eliminar
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="align-self: center; width: 80%;">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2">
   <div id="video" style="width: 100%; height: 100%;">
     Div 
   </div>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout4">
    <label id="numVis">0</label>
    <label id="vis">Visualizaciones</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout3" style="align-items: center;">
   <label id="numG">0</label>
   <label id="likesL">Me gustas</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout4" style="align-items: center;">
   <label id="numC">0</label>
   <vaadin-button id="comentarios">
    Ver comentarios
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout5" style="align-self: center; width: 60%; justify-content: flex-start;">
  <label id="descripcion">Descrpcion</label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}